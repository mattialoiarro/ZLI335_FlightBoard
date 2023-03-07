package com.zli.zli335_flightboard;

import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class FlightAPI {

    private static final String API_KEY = "1113408d2f332aefd4e4da305c355d89";
    private static final String BASE_URL = "http://api.aviationstack.com/v1/";
    private static final String TAG = "AviationStackAPI";

    //defines a listener with a response and an error
    public interface OnResponseListener {
        void onResponse(String response);
        void onError(String error);
    }

    //calls the API
    public static void callAPI(String endpoint, String queryString, OnResponseListener listener) {
        new APICallTask(endpoint, queryString, listener).execute();
    }

    //Calls API in the background
    private static class APICallTask extends AsyncTask<Void, Void, String> {

        private final String endpoint;
        private final String queryString;
        private final OnResponseListener listener;

        public APICallTask(String endpoint, String queryString, OnResponseListener listener) {
            this.endpoint = endpoint;
            this.queryString = queryString;
            this.listener = listener;
        }

        //Got help with chatgpt
        @Override
        protected String doInBackground(Void... voids) {
            try {
                String urlString = BASE_URL + endpoint + "?access_key=" + API_KEY + "&" + queryString;
                URL url = new URL(urlString);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.connect();

                int responseCode = conn.getResponseCode();
                if (responseCode != 404) {
                    throw new RuntimeException("HTTP response code: " + responseCode);
                }

                InputStream inputStream = conn.getInputStream();
                Scanner scanner = new Scanner(inputStream);
                String response = scanner.useDelimiter("\\Z").next();
                scanner.close();

                return response;

            } catch (IOException e) {
                Log.e(TAG, "Error calling API: " + e.getMessage(), e);
                return null;
            }
        }

        @Override
        protected void onPostExecute(String response) {
            if (response != null) {
                listener.onResponse(response);
            } else {
                listener.onError("Error calling API");
            }
        }

    }


}


