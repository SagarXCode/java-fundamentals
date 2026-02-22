package OOP;

class Animal {
    void eat() {
        System.out.println("Animal is Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is Barking...");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited method from Animal class
        dog.bark(); // Dog's own method
    }
}
