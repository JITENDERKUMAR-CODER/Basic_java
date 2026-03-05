package projects;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args){
//        JAVA HANGMAN GAME
        String filepath="word.txt";
        ArrayList<String> words=new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            String line;
            while((line=reader.readLine())!=null){
                words.add(line.trim());
            }

        }
        catch (FileNotFoundException e){
            System.out.println("File not found");

        }
        catch (IOException e){
            System.out.println("something went wrong");
        }
        if (words.isEmpty()) {
            System.out.println("No words available. Exiting game.");
            return;
        }
        Random rand=new Random();

        String word=words.get(rand.nextInt(words.size()));

        Scanner input = new Scanner(System.in);
        ArrayList<Character> wordState=new ArrayList<Character>();
        int wrongGuesses=0;
        for(int i=0;i<word.length();i++){
            wordState.add('_');
        }
        System.out.println("************************");
        System.out.println("Welcome to java Hangman!");
        System.out.println("************************");
        while(wrongGuesses<6){
            System.out.print(getHangmanArt(wrongGuesses));
        System.out.print("word: ");
        for(char c:wordState){
            System.out.print(c + " ");
        }
        System.out.print("\nGuess a letter: ");
        char guess=input.next().toLowerCase().charAt(0);
        if(word.indexOf(guess)>=0){
            System.out.println("correct guess!\n");
            for(int i=0;i<word.length();i++){
                if(word.charAt(i)==guess){
                    wordState.set(i,guess);
                }
            }
            if(!wordState.contains('_')){
                System.out.println(getHangmanArt(wrongGuesses));
                System.out.println("YOU WIN!");
                System.out.println("The word was: "+word);
                break;

            }

        }
        else {
            wrongGuesses++;
            System.out.println("wrong guess!\n");
        }

        }
        if(wrongGuesses>=6){
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("GAME OVER!\n");
            System.out.println("The word is: "+word);
        }

     }
    static  String getHangmanArt(int wrongGuesses){
        return switch (wrongGuesses){
            case 0 -> """
                      
                      
                      
                      """;
            case 1 -> """
                       o
                      
                      """;
            case 2 -> """
                       o
                       |
                       
                       
                      """;
            case 3 -> """
                       o
                      /|
                       
                      """;
            case 4 -> """
                       o
                      /|\\
                      
                      """;
            case 5 -> """
                       o
                      /|\\
                      / 
                 
                      """;
            case 6 -> """
                       o
                      /|\\
                      / \\ 
                      """;
            default -> "";
        };
    }
}
