package source;

import java.util.HashSet;
import java.util.Set;

public class Flight {
    private final String idFlights;
    private final String flightOrigin;
    private final String flightDestination;
    private final double travelPrice;
    private final int maximumPassengers;
    private final int reservedSeats;
    private final Set<Passenger> passengers;

    public Flight(String idFlights, String flightOrigin, String flightDestination, double travelPrice, int maximumPassengers, int reservedSeats) {
        this.idFlights = idFlights;
        this.flightOrigin = flightOrigin;
        this.flightDestination = flightDestination;
        this.travelPrice = travelPrice;
        this.maximumPassengers = maximumPassengers;
        this.reservedSeats = reservedSeats;
        this.passengers = new HashSet<>();
    }

    public String getIdFlights() {
        return idFlights;
    }

    public String getFlightOrigin() {
        return flightOrigin;
    }

    public String getFlightDestination() {
        return flightDestination;
    }

    public double getTravelPrice() {
        return travelPrice;
    }

    public int getMaximumPassengers() {
        return maximumPassengers;
    }

    public int getReservedSeats() {
        return reservedSeats;
    }

    public Set<Passenger> getPassengers() {
        return passengers;
    }

    public boolean addPassenger(Passenger passenger) {
        return this.passengers.add(passenger);
    }

    @Override
    public String toString() {
        return "Origen del vuelo: " + this.flightOrigin + "| Destino del vuelo: " + this.flightDestination + "| Precio del viaje: " + this.travelPrice + "| Capacidad maxima: " + this.maximumPassengers + "| Numero de asientos ocupados: " + this.reservedSeats;
    }
    
    public String toStringBag() {
        return this.idFlights + ": " + this.flightOrigin + " - " + this.flightDestination;
    }
}
