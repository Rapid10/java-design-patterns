package pl.rapid.builder;

import java.time.LocalDate;

public interface UserDTOBuilder {

    UserDTOBuilder withFirstName(String name);

    UserDTOBuilder withLastName(String name);

    UserDTOBuilder withBirthDate(LocalDate date);

    UserDTOBuilder withAddress(Address address);

    //assemble final product
    UserDTO build();

    //optional used to fetch object
    UserDTO getUserDTO();

}
