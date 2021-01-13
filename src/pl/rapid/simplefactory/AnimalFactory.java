package pl.rapid.simplefactory;

public class AnimalFactory {

    public static Animal resolveAnimalType(String type) {
        switch (type) {
            case "Cat": {
                return new Cat();
            }
            case "Dog": {
                return new Dog();
            }
            case "Dolphin": {
                return new Dolphin();
            }
            default:
                return new Animal();
        }
    }
}
