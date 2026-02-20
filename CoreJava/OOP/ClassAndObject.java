package OOP;

class Student {
    int id;
    String name;

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Student s1 = new Student();  // object creation

        s1.id = 101;
        s1.name = "Rahul";
        s1.display();
    }
}
