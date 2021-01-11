package pl.rapid.builder;

public class Address {

    private String zipCode;

    private String town;

    private String street;

    public Address() {
    }

    public Address(String zipCode, String town, String street) {
        this.zipCode = zipCode;
        this.town = town;
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
