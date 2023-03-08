package com.zli.zli335_flightboard;

public class Flight {
    private String flightNumber;
    private String status;
    private String departureAirport;
    private String arrivalAirport;
    private String departureTime;
    private String arrivalTime;
    private String airline;

    public Flight(String flightNumber, String status, String departureAirport, String arrivalAirport, String departureTime, String arrivalTime, String airline) {
        this.flightNumber = flightNumber;
        this.status = status;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.airline = airline;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getStatus() {
        return status;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getAirline() {
        return airline;
    }
}
