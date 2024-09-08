package org.example;

import java.util.Scanner;

public class DivisionExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Numerator: ");
        int numerator = input.nextInt();
        System.out.print("Enter the Denominator: ");
        int denominator = input.nextInt();

        try {

            int result = numerator / denominator;
            System.out.println("The result is: "+result);

        } catch (ArithmeticException e) {
            System.err.println("Error Cannot Divided by zero");
        }


    }
}
