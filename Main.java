// The main class for running the code

public class Main {
    public static void main(String[] args) {
    // The array that is supposed to hold all animals
       Animal[] animals = new Animal[3];
       animals[0] = new BlueJay("Donnie", 2);
       animals[1] = new Trout("Mac", 1);
       animals[2] = new Wolf("Moxie", 3);

       for(int i = 0; i < 3; i++) {
           animals[i].move();
           animals[i].makeSound();
       }
    }
}