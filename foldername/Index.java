package com.Basic_java;
import java.util.Scanner;

public class Index{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();

        System.out.println("enter the the character which you find the  index of it : ");
        char c=sc.nextLine().charAt(0);

        int index=name.indexOf(c);
        int lastindex=name.lastIndexOf(c);

        System.out.println( "The index of the letter is" +" "+ index);
        System.out.println( "The lastLindex of the letter is" +" "+ lastindex);

    }
}