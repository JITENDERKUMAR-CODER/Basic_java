
package com.Basic_java;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Equal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        String pass="jeetu";

        if(name.equals(pass)){
            System.out.println("your password is correct "+name);
        }
        else{

            System.out.println("Your password is not correct " );

        }
    }}