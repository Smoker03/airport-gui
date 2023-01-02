package source;

public class Corporate {
    private final String id;
    private final String name;
    private final double cost;
    private final String address;

    public Corporate(String id, String name, double cost, String address) {

        this.id = id;
        this.name = name;
        this.cost = cost;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String getAddress() {
        return address;
    }
    
    @Override
    public String toString() {
        return "Nombre de la empresa= " + name + "| costo= " + cost + "| direccion= " + address;
    }
}
