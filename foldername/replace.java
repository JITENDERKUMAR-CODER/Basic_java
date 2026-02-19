
package com.Basic_java;
import java.util.Locale;
import java.util.Scanner;

public class replace{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Enter the word or character which you want to repalce! ");
        String target=sc.nextLine();
        System.out.println("Enter the word or character which you want to repalce with! ");

        String replacement=sc.nextLine();

        name=name.replace(target,replacement);

        System.out.println(name);

    }
}