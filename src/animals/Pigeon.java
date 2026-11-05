package animals;

public class Pigeon extends Bird {

    private String species;

    public Pigeon() {
        this("Unknown", 0, 0.0, "Unknown", "Unknown");
    }

    public Pigeon(String name, int age, double weight,
                  String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, int age) {
        this(name, age, 0.0, "Unknown", "Unknown");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats seeds and grains.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " coos.");
    }

    @Override
    public String toString() {
        return "Pigeon: " + super.toString()
                + ", Species: " + species;
    }

    public void returnHome() {
        System.out.println(getName() + " returns to its home.");
    }
}

