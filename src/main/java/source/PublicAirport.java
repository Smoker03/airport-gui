package source;

import java.util.stream.Collectors;

public class PublicAirport extends Airport {
    private final double subsidy;

    public PublicAirport(String idAirport, String nameAirport, String cityLocated, String countryLocated, Double subsidy) {
        super(idAirport, nameAirport, cityLocated, countryLocated);
        this.subsidy = subsidy;
    }

    public double getSubsidy() {
        return subsidy;
    }

    @Override
    public boolean matchCompanyByAirportName(String nameAirport) {
        return this.getName().contains(nameAirport);
    }

    @Override
    public String showCorporates() {
        return "Cuenta con una subencion del gobierno, con un monto de: " + this.subsidy;
    }

    @Override
    public boolean addCompany(Company company) {
        return this.getCompanies().add(company);
    }

    @Override
    public String companiesByAirportName() {
        return "Nombre= " + this.getName()
                + "\n Companias:\n" + "Este aeropuerto pertenece al gobierno";
    }

    @Override
    public boolean isPrivate() {
        return false;
    }

    @Override
    public String toString() {
        return "IdAeropuerto= " + this.getId() + "| Nombre= " + this.getName() + "| Ciudad localizada= " + this.getCityLocated() + "| Pais localizado= " + this.getCountryLocated()
                + "| Companias:\n" + this.getCompanies().stream().map(Company::toString).collect(Collectors.joining()) + "Subsidio= "
                + this.getSubsidy();
    }
    
    @Override
    public String toStringBag() {
        return getId() + ": " + getName();
    }
}
