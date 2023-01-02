package source;

import java.util.HashSet;
import java.util.Set;

public abstract class Airport {
    private final String id;
    private final String name;
    private final String cityLocated;
    private final String countryLocated;
    private final Set<Company> companies;

    public Airport(String idAirport, String nameAirport, String cityLocated, String countryLocated) {
        this.id = idAirport;
        this.name = nameAirport;
        this.cityLocated = cityLocated;
        this.countryLocated = countryLocated;
        this.companies = new HashSet<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCityLocated() {
        return cityLocated;
    }

    public String getCountryLocated() {
        return countryLocated;
    }

    public Set<Company> getCompanies() {
        return this.companies;
    }

    public abstract boolean matchCompanyByAirportName(String nameAirport);

    public abstract String companiesByAirportName();

    public abstract boolean isPrivate();

    @Override
    public abstract String toString();
    
    public abstract String toStringBag();

    public abstract String showCorporates();

    public abstract boolean addCompany(Company company);

}
