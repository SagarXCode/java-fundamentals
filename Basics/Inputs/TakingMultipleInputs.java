package Inputs;

import java.util.Scanner;

public class TakingMultipleInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.next();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter marks: ");
        float marks = sc.nextFloat();

        System.out.println(name + " " + age + " " + marks);
    }
}
