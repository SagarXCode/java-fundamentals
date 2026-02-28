package AccessModifiers;

class Person {

    private int age = 21;   // private variable

    void showAge() {        // method inside same class
        System.out.println("Age: " + age); // allowed
    }
}

public class PrivateModifier {
    public static void main(String[] args) {

        Person p = new Person();
        p.showAge(); // allowed (through public/default method)

        // System.out.println(p.age); ❌ ERROR
    }
}
