package pl.rapid.builder;


import java.time.LocalDate;

// director simply know how to use builder
public class Director {

    public static void main(String[] args) {
        UserDTO userDTO = build(new UserWebDTOBuilder(), createUser());
        System.out.println(userDTO);
    }

    //director
    private static UserDTO build(UserDTOBuilder userDTOBuilder, User user) {
        return userDTOBuilder
                .withBirthDate(user.getBirthdate())
                .withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .build();
    }

    public static User createUser() {
        User user = new User();
        user.setBirthdate(LocalDate.of(1994, 12, 9));
        user.setFirstName("Rapid");
        user.setLastName("Kieler");
        Address address = new Address();
        address.setStreet("aaa");
        address.setTown("bbb");
        address.setZipCode("ccc");
        user.setAddress(address);
        return user;
    }

}


