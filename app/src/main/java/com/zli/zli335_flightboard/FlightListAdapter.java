package com.zli.zli335_flightboard;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FlightListAdapter extends RecyclerView.Adapter<FlightListAdapter.ViewHolder> implements ListAdapter {

    private List<Flight> mFlights;

    public FlightListAdapter(String flightIata, String flightIcao, String airlineIata, String airlineIcao, String flightNumberFull, String departureAirportIata, String arrivalAirportIata, String departureDateTime, String arrivalDateTime) {
    }

    public FlightListAdapter(MainActivity mainActivity, ArrayList<Flight> flightData) {
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View flightView = inflater.inflate(R.layout.activity_main, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(flightView);
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Get the data model based on position
        Flight flight = mFlights.get(position);

        // Set item views based on your views and data model
        holder.flightNumberTextView.setText(flight.getFlightNumber());
        holder.statusTextView.setText(flight.getStatus());
        holder.departureAirportTextView.setText(flight.getDepartureAirportName());
        holder.arrivalAirportTextView.setText(flight.getArrivalAirportName());
        holder.departureTimeTextView.setText(flight.getDepartureTimeScheduled());
        holder.arrivalTimeTextView.setText(flight.getArrivalTimeScheduled());
        holder.airlineTextView.setText(flight.getAirlineName());
    }



    @Override
    public int getItemCount() {
        return mFlights.size();
    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int i) {
        return false;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }

    @Override
    public int getViewTypeCount() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView flightNumberTextView;
        public TextView statusTextView;
        public TextView departureAirportTextView;
        public TextView arrivalAirportTextView;
        public TextView departureTimeTextView;
        public TextView arrivalTimeTextView;
        public TextView airlineTextView;

        public ViewHolder(View flightView) {
            super(flightView);
        }

       /* public ViewHolder(View itemView) {
            super(itemView);


            TextView[] flight_Data = new TextView[7];
            flight_Data[0] = itemView.findViewById(R.id.flight_number);
            flight_Data[1] = itemView.findViewById(R.id.flight_status);
            flight_Data[2] = itemView.findViewById(R.id.departure_airport);
            flight_Data[3] = itemView.findViewById(R.id.arrival_airport);
            flight_Data[4] = itemView.findViewById(R.id.departure_time);
            flight_Data[5] = itemView.findViewById(R.id.arrival_time);
            flight_Data[6] = itemView.findViewById(R.id.airline_name);

        }*/
    }
}
