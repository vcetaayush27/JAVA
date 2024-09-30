// Parent class
class Animal {
    // Method in the parent class
    public void sound() {
        System.out.println("Animals make sound.");
    }
}

// Child class (inherits from Animal)
class Cat extends Animal {
    // Method in the child class
    public void meow() {
        System.out.println("Cat meows.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Cat cat = new Cat();
        
        // Call methods from both the parent class and child class
        cat.sound();  // Calling method from the parent class (Animal)
        cat.meow();   // Calling method from the child class (Dog)
    }
}
