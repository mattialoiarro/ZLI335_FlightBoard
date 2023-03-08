package com.zli.zli335_flightboard;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;


public class FlightAPI {


    private static final String TAG = "FlightAPI";
    private static final String BASE_URL = "http://api.aviationstack.com/v1";
    private String apiKey;

    public FlightAPI() {
        this.apiKey = apiKey;
    }

    public ArrayList<Flight> getFlights(String searchQuery, FlightDataCallback flightDataCallback) {
        ArrayList<Flight> flights = new ArrayList<>();

        String url = "https://api.aviationstack.com/v1/flights?access_key=" + "1113408d2f332aefd4e4da305c355d89" + "&flight_iata=" + searchQuery;

        return flights;
    }


    public ArrayList<FlightListAdapter> getFlightData(String flightNumber) {
        ArrayList<FlightListAdapter> flightDataList = new ArrayList<>();

        try {
            //Create URL object for API endpoint
            URL url = new URL(BASE_URL + "/flights?access_key=" + apiKey + "&flight_iata=" + flightNumber);

            //Open connection to API endpoint
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            //Set request method
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Parse JSON response
                JSONObject jsonObject = new JSONObject(response.toString());
                JSONArray data = jsonObject.getJSONArray("data");

                for (int i = 0; i < data.length(); i++) {
                    JSONObject flightObject = data.getJSONObject(i);

                    //Extract flight data from JSON object
                    String flightIata = flightObject.getString("flight_iata");
                    String flightIcao = flightObject.getString("flight_icao");
                    String airlineIata = flightObject.getString("airline_iata");
                    String airlineIcao = flightObject.getString("airline_icao");
                    String flightNumberFull = flightObject.getString("flight_number");
                    String departureAirportIata = flightObject.getJSONObject("departure").getString("airport_iata");
                    String arrivalAirportIata = flightObject.getJSONObject("arrival").getString("airport_iata");
                    String departureDateTime = flightObject.getJSONObject("departure").getString("scheduled");
                    String arrivalDateTime = flightObject.getJSONObject("arrival").getString("scheduled");

                   /* //Create FlightData object and add to list
                    FlightListAdapter flightData = new FlightListAdapter(flightIata, flightIcao, airlineIata, airlineIcao,
                            flightNumberFull, departureAirportIata, arrivalAirportIata, departureDateTime, arrivalDateTime);
                    flightDataList.add(flightData);*/
                }
            } else {
                Log.e(TAG, "Error getting flight data: " + responseCode);
            }
        } catch (Exception e) {
            Log.e(TAG, "Exception getting flight data: " + e.getMessage());
        }

        return flightDataList;
    }

    public interface FlightDataCallback {

        void onSuccess(ArrayList<Flight> flights);

        void onError(String errorMessage);
    }
}


