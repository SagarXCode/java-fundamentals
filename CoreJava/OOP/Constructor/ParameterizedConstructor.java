package OOP.Constructor;

public class ParameterizedConstructor {

    int id;
    String name;

    // Parameterized Constructor
    ParameterizedConstructor(int i, String n) {
        id = i;
        name = n;
    }

    public static void main(String[] args) {

        ParameterizedConstructor s1 = new ParameterizedConstructor(1, "Amit");
        ParameterizedConstructor s2 = new ParameterizedConstructor(2, "Neha");

        s1.display();
        s2.display();
    }

    void display() {
        System.out.println(id + " " + name);
    }
}