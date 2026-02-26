package Keywords;

class Demo {
    static void display() {
        System.out.println("Static method called without object");
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Demo.display(); // No object needed
    }
}