package Keywords;

class Student {
    int age;

    Student(int age) {
        this.age = age; // 'this' refers to the current instance of the class
    }

    void show() {
        System.out.println("Age: " + age);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Student s = new Student(21);
        s.show();
    }
}
