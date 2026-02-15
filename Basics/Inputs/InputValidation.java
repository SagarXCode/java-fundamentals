package Inputs;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        } else {
            System.out.println("Invalid input!");
        }
    }
}
