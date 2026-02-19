
package com.Basic_java;
import java.util.Locale;
import java.util.Scanner;

public class lucase{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();

   name=name.toLowerCase();
   name=name.toUpperCase();


        System.out.println(name);

    }
}