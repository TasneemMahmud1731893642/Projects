import React, { useState } from "react";
import axios from "axios";
import "./App.css";

// Using local images
import detectivePikachuImage from "./img/$_57.jpeg";
import theTrapImage from "./img/unnamed (3).jpg";
import manOfSteelImage from "./img/71b6Qgy76LL._AC_UF894,1000_QL80_.jpg";

const movies = [
  { title: "Detective Pikachu", image: detectivePikachuImage, video: "https://www.w3schools.com/html/mov_bbb.mp4" },
  { title: "The Trap", image: theTrapImage, video: "https://www.w3schools.com/html/movie.mp4" },
  { title: "Man of Steel", image: manOfSteelImage, video: "https://samplelib.com/lib/preview/mp4/sample-5s.mp4" },
];

export default function NetflixClone() {
  const [selectedMovie, setSelectedMovie] = useState(null);
  const [userInput, setUserInput] = useState("");
  const [chatMessages, setChatMessages] = useState([]);
  const [showChat, setShowChat] = useState(false);

  const handleChatSubmit = async (e) => {
    e.preventDefault();
    setChatMessages((prev) => [...prev, { sender: "user", message: userInput }]);

    try {
      const response = await axios.post("https://api.openai.com/v1/chat/completions", {
        messages: [{ role: "user", content: userInput }],
        model: "gpt-3.5-turbo",
      }, {
        headers: {
          Authorization: `Bearer my-api-key`,
          "Content-Type": "application/json",
        },
      });

      const botMessage = response.data.choices[0].message.content;
      setChatMessages((prev) => [...prev, { sender: "bot", message: botMessage }]);

      const foundMovie = movies.find((movie) => botMessage.toLowerCase().includes(movie.title.toLowerCase()));
      if (foundMovie) setSelectedMovie(foundMovie);
    } catch (error) {
      console.error("Error fetching chatbot response:", error);
    }
    setUserInput("");
  };

  return (
    <div className="netflix-container">
      {selectedMovie ? (
        <div className="video-player">
          <h1 className="movie-title">{selectedMovie.title}</h1>
          <video controls autoPlay className="video-element">
            <source src={selectedMovie.video} type="video/mp4" />
            Your browser does not support the video tag.
          </video>
          <button className="close-button" onClick={() => setSelectedMovie(null)}>Close</button>
        </div>
      ) : (
        <div className="movies-section">
          <h2 className="section-title">Trending Now</h2>
          <div className="movies-grid">
            {movies.map((movie, index) => (
              <div key={index} className="movie-card" onClick={() => setSelectedMovie(movie)}>
                <img src={movie.image} alt={movie.title} className="movie-image" />
              </div>
            ))}
          </div>
        </div>
      )}

      <button className="chat-toggle-button" onClick={() => setShowChat(!showChat)}>
        💬 Chat with Movie Bot
      </button>

      {showChat && (
        <div className="chat-section">
          <h2>Chat with the Movie Bot</h2>
          <div className="chat-window">
            {chatMessages.map((msg, index) => (
              <div key={index} className={msg.sender === "user" ? "chat-user" : "chat-bot"}>
                <p>{msg.message}</p>
              </div>
            ))}
          </div>
          <form onSubmit={handleChatSubmit} className="chat-form">
            <input
              type="text"
              value={userInput}
              onChange={(e) => setUserInput(e.target.value)}
              placeholder="Ask about a movie..."
              className="chat-input"
            />
            <button type="submit" className="chat-button">Send</button>
          </form>
        </div>
      )}
    </div>
  );
}
