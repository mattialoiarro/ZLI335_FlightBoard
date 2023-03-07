package com.zli.zli335_flightboard;

public class Flight {
        private String flightNumber;
        private String status;
        private String departureAirportIATA;
        private String departureAirportICAO;
        private String departureAirportName;
        private String departureCity;
        private String departureCountry;
        private String departureTimezone;
        private String departureTimeEstimated;
        private String departureTimeScheduled;
        private String arrivalAirportIATA;
        private String arrivalAirportICAO;
        private String arrivalAirportName;
        private String arrivalCity;
        private String arrivalCountry;
        private String arrivalTimezone;
        private String arrivalTimeEstimated;
        private String arrivalTimeScheduled;
        private String airlineName;
        private String airlineIATA;
        private String airlineICAO;
        private String aircraftIATA;
        private String aircraftICAO;

        // Constructor
        public Flight(String flightNumber, String status, String departureAirportIATA, String departureAirportICAO,
                      String departureAirportName, String departureCity, String departureCountry, String departureTimezone,
                      String departureTimeEstimated, String departureTimeScheduled, String arrivalAirportIATA,
                      String arrivalAirportICAO, String arrivalAirportName, String arrivalCity, String arrivalCountry,
                      String arrivalTimezone, String arrivalTimeEstimated, String arrivalTimeScheduled, String airlineName,
                      String airlineIATA, String airlineICAO, String aircraftIATA, String aircraftICAO) {
            this.flightNumber = flightNumber;
            this.status = status;
            this.departureAirportIATA = departureAirportIATA;
            this.departureAirportICAO = departureAirportICAO;
            this.departureAirportName = departureAirportName;
            this.departureCity = departureCity;
            this.departureCountry = departureCountry;
            this.departureTimezone = departureTimezone;
            this.departureTimeEstimated = departureTimeEstimated;
            this.departureTimeScheduled = departureTimeScheduled;
            this.arrivalAirportIATA = arrivalAirportIATA;
            this.arrivalAirportICAO = arrivalAirportICAO;
            this.arrivalAirportName = arrivalAirportName;
            this.arrivalCity = arrivalCity;
            this.arrivalCountry = arrivalCountry;
            this.arrivalTimezone = arrivalTimezone;
            this.arrivalTimeEstimated = arrivalTimeEstimated;
            this.arrivalTimeScheduled = arrivalTimeScheduled;
            this.airlineName = airlineName;
            this.airlineIATA = airlineIATA;
            this.airlineICAO = airlineICAO;
            this.aircraftIATA = aircraftIATA;
            this.aircraftICAO = aircraftICAO;
        }

        public String getFlightNumber() {
            return flightNumber;
        }

        public void setFlightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getDepartureAirportIATA() {
            return departureAirportIATA;
        }

        public void setDepartureAirportIATA(String departureAirportIATA) {
            this.departureAirportIATA = departureAirportIATA;
        }

        public String getDepartureAirportICAO() {
            return departureAirportICAO;
        }

        public void setDepartureAirportICAO(String departureAirportICAO) {
            this.departureAirportICAO = departureAirportICAO;
        }

        public String getDepartureAirportName() {
            return departureAirportName;
        }

        public void setDepartureAirportName(String departureAirportName) {
            this.departureAirportName = departureAirportName;
        }

        public String getDepartureCity() {
            return departureCity;
        }

        public void setDepartureCity(String departureCity) {
            this.departureCity = departureCity;
        }

        public String getDepartureCountry() {
            return departureCountry;
        }

        public void setDepartureCountry(String departureCountry) {
            this.departureCountry = departureCountry;
        }

        public String getDepartureTimezone() {
            return departureTimezone;
        }

        public void setDepartureTimezone(String departureTimezone) {
            this.departureTimezone = departureTimezone;
        }

        public String getDepartureTimeEstimated() {
            return departureTimeEstimated;
        }

        public void setDepartureTimeEstimated(String departureTimeEstimated) {
            this.departureTimeEstimated = departureTimeEstimated;
        }

        public String getDepartureTimeScheduled() {
            return departureTimeScheduled;
        }

        public void setDepartureTimeScheduled(String departureTimeScheduled) {
            this.departureTimeScheduled = departureTimeScheduled;
        }

        public String getArrivalAirportIATA() {
            return arrivalAirportIATA;
        }

        public void setArrivalAirportIATA(String arrivalAirportIATA) {
            this.arrivalAirportIATA = arrivalAirportIATA;
        }

        public String getArrivalAirportICAO() {
            return arrivalAirportICAO;
        }

        public void setArrivalAirportICAO(String arrivalAirportICAO) {
            this.arrivalAirportICAO = arrivalAirportICAO;
        }

        public String getArrivalAirportName() {
            return arrivalAirportName;
        }

        public void setArrivalAirportName(String arrivalAirportName) {
            this.arrivalAirportName = arrivalAirportName;
        }

        public String getArrivalCity() {
            return arrivalCity;
        }

        public void setArrivalCity(String arrivalCity) {
            this.arrivalCity = arrivalCity;
        }

        public String getArrivalCountry() {
            return arrivalCountry;
        }

        public void setArrivalCountry(String arrivalCountry) {
            this.arrivalCountry = arrivalCountry;
        }

        public String getArrivalTimezone() {
            return arrivalTimezone;
        }

        public void setArrivalTimezone(String arrivalTimezone) {
            this.arrivalTimezone = arrivalTimezone;
        }

        public String getArrivalTimeEstimated() {
            return arrivalTimeEstimated;
        }

        public void setArrivalTimeEstimated(String arrivalTimeEstimated) {
            this.arrivalTimeEstimated = arrivalTimeEstimated;
        }

        public String getArrivalTimeScheduled() {
            return arrivalTimeScheduled;
        }

        public void setArrivalTimeScheduled(String arrivalTimeScheduled) {
            this.arrivalTimeScheduled = arrivalTimeScheduled;
        }

        public String getAirlineName() {
            return airlineName;
        }

        public void setAirlineName(String airlineName) {
            this.airlineName = airlineName;
        }

        public String getAirlineIATA() {
            return airlineIATA;
        }

        public void setAirlineIATA(String airlineIATA) {
            this.airlineIATA = airlineIATA;
        }

        public String getAirlineICAO() {
            return airlineICAO;
        }

        public void setAirlineICAO(String airlineICAO) {
            this.airlineICAO = airlineICAO;
        }

        public String getAircraftIATA() {
            return aircraftIATA;
        }

        public void setAircraftIATA(String aircraftIATA) {
            this.aircraftIATA = aircraftIATA;
        }

        public String getAircraftICAO() {
            return aircraftICAO;
        }

        public void setAircraftICAO(String aircraftICAO) {
            this.aircraftICAO = aircraftICAO;
        }
    }



