Disease Predictor Website

This project is a web-based disease prediction system with a Flask backend and a client-side frontend. The system utilizes a trained machine learning model to predict diseases based on user input.

Features

User-Friendly Web Interface: Allows users to input symptoms for disease prediction.

Machine Learning Model: A pre-trained model (model.pkl) that analyzes symptoms and provides predictions.

REST API: The Flask backend processes user input and returns predictions.

Scalable Architecture: The system is modular, allowing easy integration of new features and models.

Project Structure

Disease predictor website with Flask backend/
│── backend/
│   │── app.py               # Main Flask application handling requests
│   │── requirements.txt     # Python dependencies
│   │── models/
│   │   └── model.pkl        # Trained machine learning model for prediction
│   └── venv/                # Virtual environment (optional)
│
└── client/                   # Frontend files (HTML, CSS, JS for UI)

Backend Components

Flask Framework: Handles HTTP requests and serves the prediction API.

Machine Learning Model: Uses a .pkl file to predict diseases based on symptoms.

API Endpoints:

POST /predict: Accepts symptom inputs and returns a disease prediction.

GET /health: A simple health check for the API.

Frontend Components

User Input Form: Collects symptoms from users.

AJAX Requests: Sends user input to the Flask API for real-time predictions.

Dynamic UI: Displays predicted disease and relevant information.

Dependencies

Flask: For handling web requests.

Scikit-learn: For model loading and predictions.

Pandas & NumPy: For data processing.

Frontend (HTML, CSS, JavaScript): Provides an interactive interface.
