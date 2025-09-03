// bleh

public class Wolf extends Animal implements Runnable {
private String name;
private int age;

    // Constructor for Mammal
    public Wolf(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overrides the makeSound method from the Abstract Animal class
    @Override
    void makeSound() {
        System.out.println(name + " says: \"Howl!\"");
    }

    // Overrides the move method from the Abstract Animal class
    @Override
    void move() {
        System.out.println(name + " trods back and forth.");
    }

    // Overrides the run method from the Runnable interface
    @Override
    public void run() {
        System.out.println(name + " runs swiftly on all fours.");
    }
}
