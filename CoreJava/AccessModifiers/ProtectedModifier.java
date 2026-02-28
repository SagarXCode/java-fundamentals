package AccessModifiers;

class Employee {
    protected String name = "John Doe";
}

public class ProtectedModifier {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("Employee Name: " + employee.name);
    }
}
