package com.utn.passenger;

import com.utn.aerotaxi.Flight;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;


public class Passenger extends Person{
    private double totalSpend;
    private String bestAirplane;
    private ArrayList<Flight> flights = new ArrayList<>();

    //Constructor//
    public Passenger() {}
    public Passenger(String name, String lastName, String dni, int age) {
        super(name, lastName, dni, age);
    }

    public double getTotalSpend() {
        return this.totalSpend;
    }

    public boolean addFlights(Flight flight) {
        return this.flights.add(flight);
    }

    public void setTotalSpend(double totalSpend) {
        this.totalSpend = totalSpend;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public String getBestAirplane() {/*TODO*/
        return this.bestAirplane;
    }

    public void setBestAirplane(String bestAirplane) {/*TODO*/}

    @Override
    public String toString() {
        return super.toString()
                + ((bestAirplane != null) ?
                ", Total spend=$" + totalSpend + ", bestAirplane=" + bestAirplane
                :", Without flights.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return Objects.equals(getDni(), passenger.getDni()) &&
                Objects.equals(getLastName(), passenger.getLastName()) &&
                Objects.equals(getName(), passenger.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDni(), getLastName(), getName());
    }
}
