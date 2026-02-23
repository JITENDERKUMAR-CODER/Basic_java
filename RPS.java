package projects;

import java.util.Random;
import java.util.Scanner;

public class RPS {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String[] choices = {"rock", "paper", "scissors"};

        String PlayerChoice;
        String ComputerChoice;
        String PlayAgain = "yes";

        do {

            System.out.println("Enter your move (rock, paper, scissors): ");
            PlayerChoice = input.nextLine().toLowerCase();

            // check valid input
            if(!PlayerChoice.equals("rock") &&
                    !PlayerChoice.equals("paper") &&
                    !PlayerChoice.equals("scissors")) {

                System.out.println("Invalid choice! Try again.");
                continue;
            }

            // computer random choice
            ComputerChoice = choices[rand.nextInt(3)];

            System.out.println("Computer chose: " + ComputerChoice);

            // game logic
            if(PlayerChoice.equals(ComputerChoice)) {
                System.out.println("It's a tie!");
            }

            else if(
                    (PlayerChoice.equals("rock") && ComputerChoice.equals("scissors")) ||
                            (PlayerChoice.equals("paper") && ComputerChoice.equals("rock")) ||
                            (PlayerChoice.equals("scissors") && ComputerChoice.equals("paper"))
            ){
                System.out.println("You win!");
            }

            else {
                System.out.println("You lose!");
            }

            System.out.println("Play again? (yes/no): ");
            PlayAgain = input.nextLine().toLowerCase();

        } while(PlayAgain.equals("yes"));

        System.out.println("Thanks for playing!");
        input.close();
    }
}