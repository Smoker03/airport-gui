package source;

public class Passenger {
    private final String name;
    private final String lastName;
    private final String passportNumber;
    private final String nationality;
    

    public Passenger(String name, String lastName, String passportNumber, String nationality) {
        this.name = name;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }
    
    public String getLastName() {
        return lastName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getNationality() {
        return nationality;
    }


    @Override
    public String toString() {
        return "Nombre : " + this.name + " Passaporte: " + this.passportNumber + " Nacionalidad: " + this.nationality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Passenger other = (Passenger) o;
        return this.passportNumber.equals(other.getPassportNumber());
    }
}
