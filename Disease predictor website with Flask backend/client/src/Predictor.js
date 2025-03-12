import React, { useState } from "react";
import axios from "axios";

const Predictor = () => {
    const [features, setFeatures] = useState(""); // User input
    const [prediction, setPrediction] = useState(null); // Prediction result

    const handlePredict = async () => {
        try {
            // Split the input by commas, trim whitespace and handle cases like "NA" for missing features
            const featureArray = features.split(",").map(item => item.trim());

            // Ensure the feature array has a valid structure (i.e., 17 elements)
            if (featureArray.length !== 17) {
                setPrediction("Please provide exactly 17 features.");
                return;
            }

            // Prepare the data in the required format
            const response = await axios.post("http://127.0.0.1:5000/predict", {
                features: featureArray,
            });

            setPrediction(response.data.prediction); // Show prediction result
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
                placeholder="Enter features (e.g. vomiting, nausea, muscle_ache, 30, female, NA, ...)"
                value={features}
                onChange={(e) => setFeatures(e.target.value)} // Update state on input change
            />
            <button onClick={handlePredict} style={{ marginLeft: "10px" }}>
                Predict
            </button>
            {prediction && <h3>Prediction: {prediction}</h3>} {/* Show prediction result */}
        </div>
    );
};

export default Predictor;
