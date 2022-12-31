package source;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Company {
    
    private final String idCompany;
    private final String companyName;
    private final Set<Flight> flights;

    public Company(String idCompany, String companyName) {
        this.idCompany = idCompany;
        this.companyName = companyName;
        this.flights = new HashSet<>();
    }
    
    public String getIdCompany() {
        return this.idCompany;
    }

    public String getCompanyName() {
        return this.companyName;
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
        for (var flights : this.flights) {
            if (flights.getIdFlights().equals(idFLights)) {
                possibleFlights.add(flights);
            }
        }
        return "Vuelos posibles:\n" + possibleFlights.stream().map(Flight -> Flight.toString()).collect(Collectors.joining());
    }

    public String showDestinations() {
        StringBuilder destinationsContainer = new StringBuilder();
        for (var flights : flights) {
            destinationsContainer.append(flights.getFlightDestination().concat("\n"));
        }
        return "Los destinos de la compania " + getCompanyName() + " son:\n" + destinationsContainer;
    }

    public String toString() {
        return "Nombre de la compania= " + companyName + "| Vuelos disponibles: \n" + flights.stream().map(Flight -> Flight.toString()).collect(Collectors.joining());
    }
    
    public String toStringBag() {
        return idCompany + ": " + companyName;
    }
}
