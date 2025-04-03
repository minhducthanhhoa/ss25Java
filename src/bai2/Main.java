package bai2;

public class Main {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.createAnimal("dog");
        dog.speak();

        Animal cat = AnimalFactory.createAnimal("cat");
        cat.speak();

        try {
            Animal unknown = AnimalFactory.createAnimal("elephant");
            unknown.speak();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
