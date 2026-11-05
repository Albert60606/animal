package animals;

public class Fish extends Animal {

    private String waterType;

    public Fish() {
        this("Unknown", 0, 0.0, "Unknown");
    }

    public Fish(String name, int age, double weight,
                String waterType) {
        super(name, age, weight);
        this.waterType = waterType;
    }

    public Fish(String name, int age) {
        this(name, age, 0.0, "Unknown");
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats aquatic food.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName()
                + " makes no audible sound.");
    }

    @Override
    public String toString() {
        return "Fish: " + super.toString()
                + ", Water type: " + waterType;
    }

    public void swim() {
        System.out.println(getName() + " swims in water.");
    }
}

