package animals;

public class Main {

    public static void main(String[] args) {

        // Create an array of Animal references
        Animal[] animals = new Animal[6];

        // Create all objects using constructors
        animals[0] = new Mammal(
                "Elephant", 15, 500.0, "Grey");

        animals[1] = new Bird(
                "Parrot", 3, 1.2, "Green");

        animals[2] = new Fish(
                "Goldfish", 2, 0.5, "Freshwater");

        animals[3] = new Dog(
                "Buddy", 4, 20.0, "Brown", "Labrador");

        animals[4] = new Pigeon(
                "Pinky", 2, 0.4, "Grey", "Rock Pigeon");

        animals[5] = new Blowfish(
                "Puffy", 1, 0.8, "Saltwater", true);

        // Display information
        System.out.println("=== ANIMAL INFORMATION ===");

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        // Call eat()
        System.out.println("\n=== EATING ===");

        for (Animal animal : animals) {
            animal.eat();
        }

        // Call getVoice()
        System.out.println("\n=== VOICES ===");

        for (Animal animal : animals) {
            animal.getVoice();
        }

        // Call individual methods
        System.out.println("\n=== SPECIFIC METHODS ===");

        ((Mammal) animals[0]).giveBirth();

        ((Bird) animals[1]).fly();

        ((Fish) animals[2]).swim();

        ((Dog) animals[3]).fetch();

        ((Pigeon) animals[4]).returnHome();

        ((Blowfish) animals[5]).inflate();

        // Demonstrate getter and setter
        System.out.println("\n=== GETTERS AND SETTERS ===");

        System.out.println("Dog's name: "
                + animals[3].getName());

        animals[3].setName("Max");

        System.out.println("Updated dog's name: "
                + animals[3].getName());
    }
}
