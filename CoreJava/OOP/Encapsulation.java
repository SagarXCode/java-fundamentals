package OOP;

class Employee {
    private int salary;   // private variable (hidden)

    public int getSalary() {
        return salary;
    }

    public void setSalary(int s) {
        salary = s;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setSalary(30000);

        System.out.println("Salary: " + e.getSalary());
    }
}
