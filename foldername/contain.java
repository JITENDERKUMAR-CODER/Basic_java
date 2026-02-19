
package com.Basic_java;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class contain{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
       System.out.println("what do you want to find imn yours name eg.space ,letter= a,b,c");
        String  c=sc.nextLine();

        if(name.contains(c)){
            System.out.println("your name conatins "+c +" "+name);
        }
        else{

            System.out.println("Your name does not contain '" + c + "'");

        }
    }}