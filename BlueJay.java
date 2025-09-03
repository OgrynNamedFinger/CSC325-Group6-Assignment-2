// bleh

public class BlueJay extends Animal implements Flyable {
private String name;
private int age;

    // Constructor for Bird
    public BlueJay(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overrides the makeSound method from the Abstract Animal class
    @Override
    void makeSound() {
        System.out.println(name + " says: \"Chirp, Chirp.\"");
    }

    // Overrides the move method from the Abstract Animal class
    @Override
    void move() {
        System.out.println(name + " hops from branch to branch.");
    }

    // Overrides the fly method from the Flyable interface
    @Override
    public void fly() {
        System.out.println(name + " soars through the sky.");
    }
}
