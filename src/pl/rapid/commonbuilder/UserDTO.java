package pl.rapid.commonbuilder;

import java.time.LocalDate;
import java.time.Period;

public class UserDTO {

    private String name;

    private String age;

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static UserDTOBuilder getUserDTOBuilder() {
        return new UserDTOBuilder();
    }

    public static class UserDTOBuilder {

        private String firstName;
        private String lastName;
        private String age;
        private UserDTO userDTO;



        public UserDTOBuilder withFirstName(String fName) {
            firstName = fName;
            return this;
        }


        public UserDTOBuilder withLastName(String lName) {
            lastName = lName;
            return this;
        }

        public UserDTOBuilder withAge(LocalDate date) {
            Period ageInYears = Period.between(date, LocalDate.now());
            age = Integer.toString(ageInYears.getYears());
            return this;
        }

        public UserDTO build() {
            this.userDTO = new UserDTO();
            userDTO.setName(firstName + lastName);
            userDTO.setAge(age);
            return this.userDTO;
        }

        public UserDTO getUserDTO() {
            return this.userDTO;
        }

    }

}
