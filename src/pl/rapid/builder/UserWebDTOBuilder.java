package pl.rapid.builder;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder {

    private String firstName;

    private String lastName;

    private String age;

    private String address;

    private UserDTO userDTO;


    @Override
    public UserDTOBuilder withFirstName(String fName) {
        firstName = fName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lName) {
        lastName = lName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthDate(LocalDate date) {
        Period ageInYears = Period.between(date, LocalDate.now());
        age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getStreet() + address.getTown() + address.getZipCode();
        return this;
    }

    @Override
    public UserDTO build() {
        userDTO = new UserDTO(String.format("%s %s", firstName, lastName), address, age);
        return userDTO;
    }

    @Override
    public UserDTO getUserDTO() {
        return userDTO;
    }
}
