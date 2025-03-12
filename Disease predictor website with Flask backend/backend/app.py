from flask import Flask, Blueprint, request, jsonify
from flask_cors import CORS
import numpy as np
import pickle
from sklearn.preprocessing import LabelEncoder

app = Flask(__name__)

# Enable CORS for all routes or just the `/predict` route
CORS(app, resources={r"/predict": {"origins": "http://localhost:3000"}}, supports_credentials=True)

predict_blueprint = Blueprint('predict', __name__)

# Load the trained model
model = pickle.load(open("models/model.pkl", "rb"))

# Initialize LabelEncoder
label_encoder = LabelEncoder()

def predict_disease(features):
    # Convert categorical features to numeric using LabelEncoder
    encoded_features = label_encoder.fit_transform(features)  # Assuming each feature is categorical
    input_data = np.array(encoded_features).reshape(1, -1)
    prediction = model.predict(input_data)
    return prediction[0]

@predict_blueprint.route('/predict', methods=['POST', 'OPTIONS'])
def predict():
    if request.method == 'OPTIONS':
        return '', 200  # Handle preflight request
    
    # Get JSON data from the request
    data = request.get_json()
    
    if not data or 'features' not in data:
        return jsonify({'error': 'No features provided'}), 400

    # Extract features from the request data
    features = data['features']

    result = predict_disease(features)
    return jsonify({'prediction': result})

# Register the blueprint
app.register_blueprint(predict_blueprint)

if __name__ == '__main__':
    app.run(debug=True)
