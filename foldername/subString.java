
package com.Basic_java;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class subString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Email: ");
        String Email=sc.nextLine();

        if(Email.contains("@")) {


            String userName = Email.substring(0, Email.indexOf("@"));
            String Domain = Email.substring(Email.indexOf("@") + 1);
            System.out.println(userName);
            System.out.println(Domain);

        }
        else {
            System.out.println("Email does not contains @");
        }
    }}