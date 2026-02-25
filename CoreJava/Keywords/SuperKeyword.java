package Keywords;

class A {
    int a = 10;
}

class B extends A {
    int a = 20;

    void display(int a) {
        System.out.println("Method parameter a (local variable) = " + a);
        System.out.println("Instance variable a of Class B (this.a) = " + this.a);
        System.out.println("Instance variable a of Class A (super.a) = " + super.a);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        B b = new B();
        b.display(30);
    }
}
