package com.Basic_java;
import java.util.Scanner;

public class slice{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();


        char letter=name.charAt(3);
        System.out.println(letter);

    }
}