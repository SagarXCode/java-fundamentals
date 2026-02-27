package AccessModifiers;

class Student {
    public int age = 20; // Public variable can be accessed from anywhere
}

public class PublicModifier {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Age: " + s.age); // Accessing public variable directly
    }
}
