package AccessModifiers;

class Library {
    void display() {
        System.out.println("Welcome to the Library!");
    }
}

public class DefaultModifier {
    public static void main(String[] args) {
        Library library = new Library();
        library.display(); // Accessing the default method within the same package
    }
}
