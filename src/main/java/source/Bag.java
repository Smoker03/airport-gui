package source;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Bag {
    private static Bag instance = null;
    
    private final Map<String, Flight> flights;
    private final Map<String, Company> companies;
    private final Map<String, Airport> airports;
    
    public static Bag getInstance() {
        if (instance == null) {
            instance = new Bag();
        }
        
        return instance;
    }
    
    public Bag() {
        this.flights = new HashMap<>();
        this.companies = new HashMap<>();
        this.airports = new HashMap<>();
    }
    
    // Flights
    public Map<String, Flight> getFlights() {
        return this.flights;
    }
    
    public Flight addFlight(Flight flight) {
        return this.flights.put(flight.getIdFlights(), flight);
    }
    
    // Companies
    public Map<String, Company> getCompany() {
        return this.companies;
    }
    
    public Company addCompany(Company company) {
        return this.companies.put(company.getIdCompany(), company);
    }
    
    // Airports
    public Map<String, Airport> getAirport() {
        return this.airports;
    }
    
    public Airport addAirport(Airport airport) {
        return this.airports.put(airport.getIdAirport(), airport);
    }
    
    public String consultAirport(String type) {
        boolean PublicAirport = List.of("Aeropuerto publico", "Publico", "aeropuerto publico", "publico").contains(type);
        var found = new ArrayList<Airport>();
        for (var airport : airports.values()) {
            if (PublicAirport) {
                if (airport.getClass().getName().equals("source.PublicAirport")) {
                    found.add(airport);
                }
            } else {
                if (airport.getClass().getName().equals("source.PrivateAirport")) {
                    found.add(airport);
                }
            }
        }
        return found.stream().map(Airport -> Airport.getNameAirport() + "\n").collect(Collectors.joining());
    }
    
    public String listFlightsByCompanyName(String companyName) {
        var bringCompanies = airports.values().stream().flatMap(Airport -> Airport.getCompanies().stream()).toList();
        var foundCompany = new ArrayList<Company>();
        for (var company : bringCompanies) {
            if (Objects.equals(companyName, company.getCompanyName())) {
                foundCompany.add(company);
            }
        }
        return "Nombre de la compañia:" + foundCompany.stream().map(Company::getCompanyName).collect(Collectors.joining()) 
                + "Vuelos: " + flights.values().stream().map(Flight -> Flight.toString()).collect(Collectors.joining());
    }
    
    public Optional<Company> getCompanyByName(String companyName) {
        return this.companies
                .values()
                .stream()
                .filter(company -> company.getCompanyName().equals(companyName))
                .findFirst();
    }
}
