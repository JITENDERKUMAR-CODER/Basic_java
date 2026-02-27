package com.oops;

import java.util.Scanner;
//try block → contains code that may cause exception
//catch block → handles exception
//finally block always executes (whether exception occurs or not)
public class TCF {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 1st number");
        int a= input.nextInt();
        System.out.println("Please enter 2nd number");
        int b= input.nextInt();

        try{
            int c = a / b;
            System.out.println(c);
            System.out.println("This program is successfully executed");

        }
        catch(ArithmeticException e){

            System.out.println("exception occured");

        }
        finally {
            System.out.println("exiting");
        }
    }


}
