package projects;

import java.util.Scanner;

public class QUIZ{

    public static void main(String[] args){
//JAVA QUIZ GAME
//QUESTION array[]
        String[] Questions ={"What gas do humans need to breathe to survive?",
                "Which device is used to input text into a computer?",
                "Which symbol is used to end a statement in Java?",
                "Which keyword is used to create a class in Java?",
                "Which planet is known as the Red Planet?"};
//OPTIONS ARRAY[][]
        String[][]options={{"A) Carbon Dioxide" , "B) Nitrogen" , "C) Oxygen " , "D) Hydrogen"},
                           {"A) Monitor" , "B) Keyboard " , "C) Printer" , "D) Speaker"},
                           {"A) ." , "B) ," , "C) :" , "D) ;"},
                           {"A) function" , "B) define" , "C) class " , "D) new"},
                           {"A) Earth" , "B) Mars " , "C) Jupiter" , "D) Venus"}};
//declare variables
        char[] answers={'C','B','D','C','B'};
        int score=0;
        char guess;
        //welcome message
        Scanner sc=new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("Welcome to the Quiz Game!");
        System.out.println("-------------------------");
//questions loop
        for(int i=0;i<Questions.length;i++){
            System.out.println(Questions[i]);
            for(String option:options[i]){
                System.out.println(option);
            }
//get guess from user

            System.out.println("Enter your Guess:");
            System.out.print("Enter your guess (A, B, C, D): ");
            guess=sc.next().charAt(0);

//check our guess
            if (guess==answers[i]){
                System.out.println("********************");
                System.out.println("You guessed Correct✅!");
                System.out.println("********************");

            }
            else{
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("You guessed Incorrect❌!");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
//display final score

        System.out.println("Your final score is: "+score+"out of "+Questions.length);
sc.close();
    }
}
