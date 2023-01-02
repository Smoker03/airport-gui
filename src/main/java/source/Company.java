package source;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Company {
    
    private final String id;
    private final String name;
    private final Set<Flight> flights;

    public Company(String id, String companyName) {
        this.id = id;
        this.name = companyName;
        this.flights = new HashSet<>();
    }
    
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean addFlight(Flight flight) {
        return this.flights.add(flight);
    }
    
    public Set<Flight> getFlights() {
        return this.flights;
    }

//    public void showFlightPrice(String destination, String Company) {
//    }

    public String showFlightsById(String idFLights) {
        var possibleFlights = new ArrayList<Flight>();
        for (var flight : this.flights) {
            if (flight.getIdFlights().equals(idFLights)) {
                possibleFlights.add(flight);
            }
        }
        return "Vuelos posibles:\n" + possibleFlights.stream().map(Flight -> Flight.toString()).collect(Collectors.joining());
    }

    public String showDestinations() {
        StringBuilder destinationsContainer = new StringBuilder();
        for (var flight : flights) {
            destinationsContainer.append(flight.getFlightDestination().concat("\n"));
        }
        return "Los destinos de la compania " + getName() + " son:\n" + destinationsContainer;
    }

    @Override
    public String toString() {
        return "Nombre de la compania= " + name + "| Vuelos disponibles: \n" + flights.stream().map(Flight -> Flight.toString()).collect(Collectors.joining());
    }
    
    public String toStringBag() {
        return id + ": " + name;
    }
}
