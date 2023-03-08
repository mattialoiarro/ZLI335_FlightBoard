package com.zli.zli335_flightboard;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Flight> flightData;
    private ListView flightListView;
    private FlightListAdapter flightListAdapter;
    private ProgressBar progressBar;
    private FlightAPI flightAPI;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the FlightAPI instance
        flightAPI = new FlightAPI();

        // Find the ListView and ProgressBar in the layout file
        progressBar = findViewById(R.id.progressBar);

        // Set up the search bar in the action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setCustomView(R.layout.flight_search);
        searchView = actionBar.getCustomView().findViewById(R.id.search_bar);
        searchView.setIconifiedByDefault(false);
        searchView.requestFocus();

        // Set up the search bar listener to handle user input
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                progressBar.setVisibility(View.VISIBLE);

                flightAPI.getFlights(query, new FlightAPI.FlightDataCallback() {
                    @Override
                    public void onSuccess(ArrayList<Flight> flights) {
                        //Hide the progress bar
                        progressBar.setVisibility(View.GONE);

                        //Store the flight data and update the FlightListAdapter
                        flightData = flights;
                        flightListAdapter = new FlightListAdapter(MainActivity.this, flightData);
                        flightListView.setAdapter((ListAdapter) flightListAdapter);
                    }

                    @Override
                    public void onError(String errorMessage) {
                        // Hide the progress bar and display an error message
                        progressBar.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, errorMessage, Toast.LENGTH_LONG).show();
                    }
                });

                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }


    // Menu-related methods
    @SuppressLint("ResourceType")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.layout.activity_main, menu);
        return true;
    }


    // Define a new interface that extends FlightAPI.FlightDataCallback
    public interface FlightDataListener extends FlightAPI.FlightDataCallback {
        // Add any additional methods or callbacks that you need
    }

    private FlightDataListener flightDataListener = new FlightDataListener() {
        @Override
        public void onSuccess(ArrayList<Flight> flights) {
            progressBar.setVisibility(View.GONE);
            flightData.clear();
            flightData.addAll(flights);
            flightListAdapter.notifyDataSetChanged();
        }

        @Override
        public void onError(String errorMessage) {
            progressBar.setVisibility(View.GONE);
            Toast.makeText(MainActivity.this, errorMessage, Toast.LENGTH_LONG).show();
        }
    };

    private FlightAPI.FlightDataCallback flightDataCallback = new FlightAPI.FlightDataCallback() {
        @Override
        public void onSuccess(ArrayList<Flight> flights) {
            flightDataListener.onSuccess(flights);
        }

        @Override
        public void onError(String errorMessage) {
            flightDataListener.onError(errorMessage);
        }
    };
}

