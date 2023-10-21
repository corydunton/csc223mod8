package edu.vwcc.queue;

public class Plane {
    private String airline;
    private String flightNumber;
    private String model;
    private int seatCapacity;

    public Plane(String airline, String flightNumber, String model, int seatCapacity) {
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.model = model;
        this.seatCapacity = seatCapacity;
    }

    public String getAirline() {
        return airline;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getModel() {
        return model;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    @Override
    public String toString() {
        return airline + ", Flight #" + flightNumber + ", is a " + model + " model that can seat " + seatCapacity + " persons.";
    }
}

