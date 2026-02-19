
package com.Basic_java;
import java.util.Locale;
import java.util.Scanner;

public class Empty{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();

      if(name.isEmpty()){
          System.out.println("Please enter your name first!");
      }
      else{


        System.out.println(name);

    }
}}