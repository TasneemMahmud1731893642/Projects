import React, { useState } from 'react';
import axios from 'axios';
import './App.css';  // Import the App.css file

function App() {
  const [city, setCity] = useState('');
  const [weatherData, setWeatherData] = useState(null);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState(null);

  const apiKey = '6f61490d974e4abb987121740250103'; // Replace with your WeatherAPI key
  const apiUrl = `https://api.weatherapi.com/v1/current.json?key=${apiKey}&q=${encodeURIComponent(city)}&aqi=no`;

  const fetchWeather = async () => {
    if (city.trim() === '') return;  // Don't make request if city is empty
    setLoading(true);
    setError(null);
    try {
      const response = await axios.get(apiUrl);
      console.log(response.data);  // Log the API response for debugging
      setWeatherData(response.data);
    } catch (err) {
      console.error(err);  // Log the error for debugging
      setError('City not found or API request failed');
    }
    setLoading(false);
  };

  const handleCityChange = (event) => {
    setCity(event.target.value);
  };

  const handleButtonClick = () => {
    fetchWeather();
  };

  // Get the weather icon URL based on condition
  const getWeatherIcon = (condition) => {
    // Normalize the condition to lowercase for easier matching
    const normalizedCondition = condition.toLowerCase();

    if (normalizedCondition.includes('sun')) {
      return 'https://cdn.weatherapi.com/weather/64x64/day/113.png'; // Sunny icon
    } else if (normalizedCondition.includes('cloud')) {
      return 'https://cdn.weatherapi.com/weather/64x64/day/119.png'; // Cloudy icon
    } else if (normalizedCondition.includes('rain') || normalizedCondition.includes('drizzle')) {
      return 'https://cdn.weatherapi.com/weather/64x64/day/302.png'; // Rain icon
    } else if (normalizedCondition.includes('snow')) {
      return 'https://cdn.weatherapi.com/weather/64x64/day/332.png'; // Snow icon
    } else if (normalizedCondition.includes('fog')) {
      return 'https://cdn.weatherapi.com/weather/64x64/day/248.png'; // Fog icon
    } else if (normalizedCondition.includes('storm')) {
      return 'https://cdn.weatherapi.com/weather/64x64/day/200.png'; // Storm icon
    } else {
      return 'https://cdn.weatherapi.com/weather/64x64/day/113.png'; // Default sunny icon
    }
  };

  return (
    <div className="App">
      <h1>Weather App</h1>
      <input
        type="text"
        value={city}
        onChange={handleCityChange}
        placeholder="Enter city"
      />
      <button onClick={handleButtonClick}>Get Weather</button>
      
      {loading && <p className="loading">Loading...</p>}
      {error && <p style={{ color: 'red' }}>{error}</p>}
      
      {weatherData && (
        <div>
          <h2>{weatherData.location.name}</h2>
          <div className="weather-icon">
            <img src={getWeatherIcon(weatherData.current.condition.text)} alt="weather icon" />
          </div>
          <p className="weather-info">
            Temperature: <span className="value">{weatherData.current.temp_c}°C</span>
          </p>
          <p className="weather-info">
            Weather: <span className="value">{weatherData.current.condition.text}</span>
          </p>
          <p className="weather-info">
            Humidity: <span className="value">{weatherData.current.humidity}%</span>
          </p>
          <p className="weather-info">
            Wind Speed: <span className="value">{weatherData.current.wind_kph} kph</span>
          </p>
        </div>
      )}
    </div>
  );
}

export default App;
