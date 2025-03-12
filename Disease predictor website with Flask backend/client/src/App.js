import React, { useState } from "react";
import axios from "axios";
import './App.css';

const Predictor = () => {
    const [age, setAge] = useState(""); // User age input
    const [gender, setGender] = useState(""); // User gender input
    const [symptoms, setSymptoms] = useState([]); // Symptoms input as an array
    const [prediction, setPrediction] = useState(null); // Prediction result

    const handleSymptomsChange = (event) => {
        // Convert input string to array based on commas
        const symptomsArray = event.target.value.split(",").map((item) => item.trim());
        setSymptoms(symptomsArray);
    };

    const handlePredict = async () => {
        // Ensure the input has exactly 17 features (15 symptoms, 1 age, 1 gender)
        if (!age || !gender) {
            setPrediction("Please provide both age and gender.");
            return;
        }

        // Fill missing symptoms with "NA" if fewer than 15 symptoms are provided
        let featureArray = [...symptoms];

        // Ensure there are exactly 15 symptoms; fill with "NA" if less than 15
        while (featureArray.length < 15) {
            featureArray.push("NA");
        }

        // Add age and gender at the end of the feature array
        featureArray = [...featureArray, age, gender];

        // Ensure the final array has 17 features
        if (featureArray.length !== 17) {
            setPrediction("Please provide exactly 17 features.");
            return;
        }

        try {
            const response = await axios.post("http://127.0.0.1:5000/predict", {
                features: featureArray,
            });
            setPrediction(response.data.prediction);
        } catch (error) {
            console.error("Error fetching prediction:", error);
            setPrediction("Error making prediction.");
        }
    };

    return (
        <div style={{ textAlign: "center", padding: "20px" }}>
            <h2>Disease Prediction</h2>
            <input
                type="text"
                placeholder="Enter symptoms (e.g. vomiting, nausea, muscle_ache, ...)"
                value={symptoms.join(",")}
                onChange={handleSymptomsChange}
            />
            <br />
            <input
                type="text"
                placeholder="Enter age (e.g. 45)"
                value={age}
                onChange={(e) => setAge(e.target.value)}
            />
            <br />
            <input
                type="text"
                placeholder="Enter gender (e.g. male, female)"
                value={gender}
                onChange={(e) => setGender(e.target.value)}
            />
            <br />
            <button onClick={handlePredict} style={{ marginTop: "10px" }}>Predict</button>
            {prediction && <h3>Prediction: {prediction}</h3>}
        </div>
    );
};

export default Predictor;
