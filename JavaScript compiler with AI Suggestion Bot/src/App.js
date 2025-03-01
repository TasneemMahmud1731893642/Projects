// OnlineJSCompiler.js
import { useState } from 'react';
import './App.css';

const OnlineJSCompiler = () => {
    const [code, setCode] = useState('');
    const [output, setOutput] = useState('');
    const [aiSuggestion, setAiSuggestion] = useState('');

    // Function to execute JavaScript code
    const handleRunCode = () => {
        console.log('Run Code button clicked');
        try {
            const consoleLog = [];
            const customConsole = {
                log: (...args) => consoleLog.push(args.join(' ')),
            };
            const result = Function('console', `"use strict"; ${code}`)(customConsole);
            setOutput(consoleLog.join('\n') || result?.toString() || '');
        } catch (err) {
            console.error('Error:', err);
            setOutput(err.toString());
        }
    };

    // Function to get AI suggestions directly using OpenAI API
    const getAiSuggestion = async () => {
        try {
            const response = await fetch('https://api.openai.com/v1/chat/completions', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                    'Authorization': `Bearer sk-FHwxMfw_EZsp91LfuiAzC7DY8rytkUO2OOU11kxGGgT3BlbkFJs9HaCnHg_LcOXj0PKzqWMDHMuEFmlA_Yov6T6COCYA`
                },
                body: JSON.stringify({
                    model: 'gpt-3.5-turbo',
                    messages: [{ role: 'user', content: `Suggest improvements for the following JavaScript code:\n\n${code}` }],
                    max_tokens: 150,
                }),
            });

            if (!response.ok) {
                console.error('Error details:', await response.json());
                throw new Error(`API error: ${response.status}`);
            }

            const data = await response.json();
            console.log('API Response:', data);

            setAiSuggestion(data.choices[0]?.message?.content || 'No suggestion available');
        } catch (error) {
            console.error('Error fetching AI suggestion:', error);
            setAiSuggestion(`Error: ${error.message}`);
        }
    };

    return (
        <div className="container">
            <h1 className="title">Online JavaScript Compiler</h1>
            <div className="code-input">
                <textarea
                    rows="8"
                    placeholder="Write your JavaScript code here..."
                    value={code}
                    onChange={(e) => setCode(e.target.value)}
                ></textarea>
                <button onClick={handleRunCode}>Run Code</button>
            </div>
            <div className="ai-suggestions">
                <button onClick={getAiSuggestion}>Get AI Suggestion</button>
                <div className="suggestion-container">
                    <h3>AI Suggestions:</h3>
                    <pre className="ai-suggestion">{aiSuggestion}</pre>
                </div>
            </div>
            <div className="output-container">
                <h2>Output:</h2>
                <pre className="output">{output}</pre>
            </div>
        </div>
    );
};

export default OnlineJSCompiler;
