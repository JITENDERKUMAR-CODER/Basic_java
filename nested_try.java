package com.oops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class nested_try {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Please enter 1st number");
            int a = input.nextInt();

            System.out.println("Please enter 2nd number");
            int b = input.nextInt();

            int[] arr = {10, 20, 30};

            // Inner try block
            try {
                int c = a / b;  // may cause ArithmeticException
                System.out.println("Division result: " + c);
            }
            catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            }

            // This may cause ArrayIndexOutOfBoundsException
            System.out.println("Array element: " + arr[5]);

        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numbers only.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error occurred.");
        }

        System.out.println("Program ended safely.");
    }
}