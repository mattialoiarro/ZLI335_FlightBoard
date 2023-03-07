package com.zli.zli335_flightboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FlightListAdapter extends RecyclerView.Adapter<FlightListAdapter.ViewHolder> {

    private List<Flight> mFlights;

    public FlightListAdapter(List<Flight> flights) {
        mFlights = flights;
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

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
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

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView flightNumberTextView;
        public TextView statusTextView;
        public TextView departureAirportTextView;
        public TextView arrivalAirportTextView;
        public TextView departureTimeTextView;
        public TextView arrivalTimeTextView;
        public TextView airlineTextView;

        public ViewHolder(View itemView) {
            super(itemView);

            // Find views
            flightNumberTextView = itemView.findViewById(R.id.flight_number);
            statusTextView = itemView.findViewById(R.id.flight_status);
            departureAirportTextView = itemView.findViewById(R.id.departure_airport);
            arrivalAirportTextView = itemView.findViewById(R.id.arrival_airport);
            departureTimeTextView = itemView.findViewById(R.id.departure_time);
            arrivalTimeTextView = itemView.findViewById(R.id.arrival_time);
            airlineTextView = itemView.findViewById(R.id.airline_name);
        }
    }
}
