package pl.rapid.simplefactory;

public class Client {


    public static void main(String[] args) {

        String dynamicType = "dog";

        Animal dog = AnimalFactory.resolveAnimalType(dynamicType);

    }

}
