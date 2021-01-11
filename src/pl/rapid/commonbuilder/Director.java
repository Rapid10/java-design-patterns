package pl.rapid.commonbuilder;

import java.time.LocalDate;

public class Director {

    public static void main(String[] args) {
        UserDTO userDTO = UserDTO.getUserDTOBuilder()
                .withAge(LocalDate.of(1994, 12, 9))
                .withFirstName("Mikolaj")
                .withLastName("Rapid")
                .build();
        System.out.println(userDTO);
    }

}
