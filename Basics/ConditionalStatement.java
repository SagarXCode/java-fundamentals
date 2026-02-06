public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 10;

        // if-statement
        if (age < 20) {
            System.out.println("Age is smaller than 20");
        }

        // if-else statement
        boolean isRaining = true;
        if (isRaining) {
            System.out.println("Take an umbrella");
        } else {
            System.out.println("No need for an umbrella");
        }

        // else-if statement
        int number = 5;

        if (number < 0) {
            System.out.println("It is negative.");
        } else if (number == 0) {
            System.out.println("Number is zero");
        } else {
            System.out.println("The number is positive.");
        }

        // Switch statement
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
