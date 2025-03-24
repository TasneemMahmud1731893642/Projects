/* global responsiveVoice */

import { useState, useEffect } from "react";
import "./App.css";

export default function App() {
  const [isListening, setIsListening] = useState(false);
  const [transcript, setTranscript] = useState("");
  const [response, setResponse] = useState(""); // Store AI response
  const [timer, setTimer] = useState(null); // Timer for detecting silence
  const [isProcessing, setIsProcessing] = useState(false); // Flag to prevent new input before AI response
  const [language, setLanguage] = useState("en-US"); // Default language is English

  let recognition;
  let latestTranscript = ""; // Store latest transcript from the onresult callback

  if ("webkitSpeechRecognition" in window) {
    recognition = new window.webkitSpeechRecognition();
    recognition.continuous = true;
    recognition.interimResults = true;

    recognition.onresult = (event) => {
      let finalTranscript = "";
      for (let i = 0; i < event.results.length; i++) {
        finalTranscript += event.results[i][0].transcript;
      }
      latestTranscript = finalTranscript; // Store the latest transcript

      setTranscript(finalTranscript); // Update state with the transcript

      // Reset timer whenever speech is detected
      resetTimer();
    };

    recognition.onend = () => {
      if (!isProcessing) {
        // Directly use the latest transcript from the onresult callback
        console.log("Recording stopped, sending message:", latestTranscript);
        getAIResponse(latestTranscript); // Send the updated transcript to OpenAI when recognition ends
      }
    };
  } else {
    alert("Your browser does not support speech recognition.");
  }

  const startListening = () => {
    if (recognition) {
      recognition.lang = language; // Set the current language before starting recognition
      recognition.start();
      setIsListening(true);
    }
  };

  const stopListening = () => {
    if (recognition) {
      recognition.stop();
      setIsListening(false);
    }
  };

  const getAIResponse = async (message) => {
    if (!message || isProcessing) return; // Skip if no message or already processing

    setIsProcessing(true); // Mark as processing to prevent new inputs

    // Log the input message
    console.log("Sending POST request with message:", message);

    
    const response = await fetch("https://api.openai.com/v1/chat/completions", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
        Authorization: `Bearer API_KEY`,
      },
      body: JSON.stringify({
        model: "gpt-4", // or "gpt-3.5-turbo"
        messages: [
          { role: "system", content: "You're name is Jarvis and you are my AI assistant. Always call me boss. If someone asks your name, say that you are Jarvis." }, // AI Instructions
          { role: "user", content: message },
        ],
      }),
    });

    const data = await response.json();
    setResponse(data.choices[0].message.content);

    setIsProcessing(false); // Allow new input after processing is complete
  };

  // Function to reset the timer
  const resetTimer = () => {
    if (timer) {
      clearTimeout(timer); // Clear the existing timer
    }

    const newTimer = setTimeout(() => {
      stopListening(); // Stop listening after 5 seconds of silence
    }, 5000); // 5 seconds

    setTimer(newTimer);
  };

  useEffect(() => {
    // Clean up the timer when component is unmounted or when the recording stops
    return () => {
      if (timer) {
        clearTimeout(timer);
      }
    };
  }, [timer]);

  const handleLanguageSwitch = (event) => {
    const selectedLanguage = event.target.value;
    setLanguage(selectedLanguage); // Update the language based on the user's selection
  };

  // Function to make the AI response speech
  const speakAIResponse = () => {
    if (language === "en-US") {
      // For English
      responsiveVoice.speak(response, "UK English Male");
    } else if (language === "bn-BD") {
      // For Bangla
      responsiveVoice.speak(response, "Bangla Bangladesh Male");
    }
  };
  

  return (
    <div className="container">
      <h1>Jarvis</h1>
      <p>Speak, and the AI will respond.</p>

      <div className="language-switch">
        <label>
          Language:
          <select onChange={handleLanguageSwitch} value={language}>
            <option value="en-US">English</option>
            <option value="bn-BD">Bangla</option>
          </select>
        </label>
      </div>

      <div className="button-container">
        <button onClick={startListening} className="start" disabled={isListening}>
          Start Recording
        </button>
        <button onClick={stopListening} className="stop" disabled={!isListening}>
          Stop Recording
        </button>
      </div>

      <div className="chat-box">
        <p><strong>You:</strong> {transcript || "Your speech will appear here..."}</p>
        
        <p><strong>AI:</strong> {response || "Waiting for your input..."}</p>
      </div>

      <div className="speak-container">
        {response && (
          <button onClick={speakAIResponse} className="speak">
            Listen to AI Response
          </button>
        )}
      </div>
    </div>
  );
}
