package projects;

import java.util.Random;
import java.util.Scanner;

public class Guesses {

    public static void main(String[] args){
        int min=1;
        int max=100;

        Random rn=new Random();
        Scanner sc= new Scanner(System.in);
        int guess;
        int Attempts=0;
        int randomnumber=rn.nextInt(min,max);
        System.out.println("The Guessing game");
        System.out.println(" guess between 1-100");
        do{
            System.out.println("Enter the number");
            guess=sc.nextInt();
            Attempts++;
            if(guess<randomnumber){
                System.out.println("You are so close");
            } else if (guess>randomnumber) {
                System.out.println("You are far away");
            }

            else{
                System.out.println("correct you guess the number"+randomnumber);
            }


        }while (guess!=randomnumber);
        System.out.println("you win:)");
        System.out.println(Attempts);

    }
}