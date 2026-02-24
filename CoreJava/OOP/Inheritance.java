package OOP;

class Animals {
    void eat() {
        System.out.println("Animal is Eating...");
    }
}

class Dogs extends Animals {
    void bark() {
        System.out.println("Dog is Barking...");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Dogs dogs = new Dogs();
        dogs.eat(); // Inherited method from Animal class
        dogs.bark(); // Dog's own method
    }
}
