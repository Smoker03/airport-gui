package source;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Bag {
    private static Bag instance = null;
    
    private final Map<String, Flight> flights;
    private final Map<String, Company> companies;
    private final Map<String, Airport> airports;
    private final Map<String, Corporate> corporates;
    
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
        this.corporates = new HashMap<>();
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
        return this.companies.put(company.getId(), company);
    }
    
    // Airports
    public Map<String, Airport> getAirport() {
        return this.airports;
    }
    
    public Airport addAirport(Airport airport) {
        return this.airports.put(airport.getId(), airport);
    }
    
    // Corporates
    public Map<String, Corporate> getCorporate() {
        return this.corporates;
    }
    
    public Corporate addCorporate(Corporate corporate) {
        return this.corporates.put(corporate.getId(), corporate);
    }
    
    
    public Object[] consultAirport(String type) {
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
        return found.toArray();
    }
    
    public Optional<Company> getCompanyByName(String companyName) {
        return this.companies
                .values()
                .stream()
                .filter(company -> company.getName().equals(companyName))
                .findFirst();
    }
    
    public Object[] listFlightsByCompanyName(String companyName) {
        var companyFound = this.getCompanyByName(companyName);
        return companyFound.stream().flatMap(Company -> Company.getFlights().stream()).toArray();
    }
    
    
    
    public Map<String, PrivateAirport> getPrivateAirport() {
        var found = new HashMap<String, PrivateAirport>();
        for(var privateAirport : airports.values()) {
            if (privateAirport.getClass().getName().equals("source.PrivateAirport")) {
                found.put(privateAirport.getId(), (PrivateAirport) privateAirport);
            }
        }
    return found;
    }
    
    public Object[] showCorporates() {
        var privateAirport = new ArrayList<PrivateAirport>();
        
        for (Airport corporate : airports.values()) {
            if(corporate.isPrivate()) {
                privateAirport.add((PrivateAirport) corporate);
                return privateAirport.stream().flatMap(PrivateAirport -> PrivateAirport.getCorporates().stream()).toArray();
            } else {
                return new Object[]{"El aeropuerto pertenece al gobierno"};
            }
        }
        return null;
    }
    
    public Object[] showCompaniesByAirportName(String airport) {
        var companiesByAirportName = new ArrayList<Airport>();
        for (var airportB : airports.values()) {
            if (airportB.matchCompanyByAirportName(airport)) {
                companiesByAirportName.add(airportB);
            }
        }
        return companiesByAirportName.stream().flatMap(Airport -> Airport.getCompanies().stream()).toArray();
    }
    
    public Optional<Flight> getFlightById(String id) {
        return flights.values().stream().filter(flight -> flight.getIdFlights().equals(id)).findFirst();
    }
    
    public Object[] showDestinations() {
        return flights.values().stream().toArray();
    }
}
