package OOP;

abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Normal method
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Child class
class Dog extends Animal {
    // Implement abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();   // Calls Dog's sound method
        d.sleep();   // Calls Animal's method
    }
}
