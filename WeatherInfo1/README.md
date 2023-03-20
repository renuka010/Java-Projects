
# Weather Info for Pincode

This is an REST API application made using Spring boot that returns weather information for the current day for a pincode.

### Description
* Used OpenWeather Geocoding API for getting latitude and longitude information.
* Used OpenWeather Current weather data API to get weather details for location.
* API calls are optimized by using MySql database as a backend.
## API Reference

#### Get Weather Details

```http
  GET /weather
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `pincode` | `int` | **Required**. Pincode of the location |

To make API call please update your API key in weatherservice.java file. This project can currently retrieve weather details only for those location inside India.
