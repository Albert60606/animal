package animals;

public class Bird extends Animal {

    private String featherColor;

    public Bird() {
        this("Unknown", 0, 0.0, "Unknown");
    }

    public Bird(String name, int age, double weight,
                String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name, int age) {
        this(name, age, 0.0, "Unknown");
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public void eat() {
        System.out.println(getName()
                + " eats seeds and insects.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " chirps.");
    }

    @Override
    public String toString() {
        return "Bird: " + super.toString()
                + ", Feather color: " + featherColor;
    }

    public void fly() {
        System.out.println(getName() + " flies in the sky.");
    }
}
