
package com.Basic_java;
import java.util.Locale;
import java.util.Scanner;

public class trim{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
//The trim() method removes extra spaces from the beginning and end of a string.
        name=name.trim();


        System.out.println(name);

    }
}