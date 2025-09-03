// bleh

public class Trout extends Animal implements Swimmable {
private String name;
private int age;
    // Constructor for Fish
    public Trout(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overrides the makeSound method from the Abstract Animal class
    @Override
    void makeSound() {
        System.out.println(name + " says: \"Glub, glub.\"");
    }

    // Overrides the move method from the Abstract Animal class
    @Override
    void move() {
        System.out.println(name + " sways side to side.");
    }

    // Overrides the swim method from the Swimmable interface
    @Override
    public void swim() {
        System.out.println(name + " swims gracefully through the water.");
    }
}
