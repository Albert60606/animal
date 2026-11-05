package animals;

public abstract class Animal {

    private String name;
    private int age;
    private double weight;

    // Default constructor
    public Animal() {
        this("Unknown", 0, 0.0);
    }

    // Constructor with all parameters
    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Constructor with some parameters
    public Animal(String name, int age) {
        this(name, age, 0.0);
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and setter for weight
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Abstract methods
    public abstract void eat();

    public abstract void getVoice();

    // toString method
    @Override
    public String toString() {
        return "Name: " + name
                + ", Age: " + age
                + ", Weight: " + weight + " kg";
    }
}

