package animals;

public class Blowfish extends Fish {

    private boolean isPoisonous;

    public Blowfish() {
        this("Unknown", 0, 0.0, "Saltwater", true);
    }

    public Blowfish(String name, int age, double weight,
                    String waterType, boolean isPoisonous) {
        super(name, age, weight, waterType);
        this.isPoisonous = isPoisonous;
    }

    public Blowfish(String name, int age) {
        this(name, age, 0.0, "Saltwater", true);
    }

    public boolean isPoisonous() {
        return isPoisonous;
    }

    public void setPoisonous(boolean isPoisonous) {
        this.isPoisonous = isPoisonous;
    }

    @Override
    public void eat() {
        System.out.println(getName()
                + " eats small aquatic animals.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName()
                + " makes no audible sound.");
    }

    @Override
    public String toString() {
        return "Blowfish: " + super.toString()
                + ", Poisonous: " + isPoisonous;
    }

    public void inflate() {
        System.out.println(getName() + " inflates its body.");
    }
}

