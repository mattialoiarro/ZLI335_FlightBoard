package com.zli.zli335_flightboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FlightListAdapter extends ArrayAdapter<Flight> {

    private static class ViewHolder {
        TextView flightNumberTextView;
        TextView statusTextView;
        TextView departureAirportTextView;
        TextView arrivalAirportTextView;
        TextView departureTimeTextView;
        TextView arrivalTimeTextView;
        TextView airlineTextView;
    }

    public FlightListAdapter(Context context, ArrayList<Flight> flights) {
        super(context, 0, flights);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Flight flight = getItem(position);

        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.activity_main, parent, false);
            viewHolder.flightNumberTextView = convertView.findViewById(R.id.flight_number);
            viewHolder.statusTextView = convertView.findViewById(R.id.flight_status);
            viewHolder.departureAirportTextView = convertView.findViewById(R.id.departure_airport);
            viewHolder.arrivalAirportTextView = convertView.findViewById(R.id.arrival_airport);
            viewHolder.departureTimeTextView = convertView.findViewById(R.id.departure_time);
            viewHolder.arrivalTimeTextView = convertView.findViewById(R.id.arrival_time);
            viewHolder.airlineTextView = convertView.findViewById(R.id.airline_name);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.flightNumberTextView.setText(flight.getFlightNumber());
        viewHolder.statusTextView.setText(flight.getStatus());
        viewHolder.departureAirportTextView.setText(flight.getDepartureAirport());
        viewHolder.arrivalAirportTextView.setText(flight.getArrivalAirport());
        viewHolder.departureTimeTextView.setText(flight.getDepartureTime());
        viewHolder.arrivalTimeTextView.setText(flight.getArrivalTime());
        viewHolder.airlineTextView.setText(flight.getAirline());

        return convertView;
    }
}
