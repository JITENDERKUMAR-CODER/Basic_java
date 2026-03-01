package projects;
import java.util.Random;
import java.util.Scanner;
public class Slot_machine{
    public static void main(String[] args){
//JAVA SLOT MACHINE
// DECLARE VARIABLE
        Scanner input = new Scanner(System.in);
        int balance=100;
        int bet;
        int payout;
        String[] row;
        String playAgain;
       int minBet=5;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" WELCOME TO JAVA Slots ");
        System.out.println("symbols:❤️ 🔔 🌻 🎨 😭");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

// PLAY IF BALANCE > 0
        while(balance>0){
            System.out.println("current balance: $"+balance);
            System.out.println("place your bet amount: ");
            bet=input.nextInt();
            input.nextLine();
// VERIFY IF BET >BALANCE
            if(bet>balance){
                System.out.println("INSUFFICIENT FUNDS");
                continue;
// VERIFY IF BET>0
            } else if (bet<=0) {
                System.out.println("bet must be greater than 0");
            }
// VERIFY IF BET<MINBET
            else if(bet < minBet){
                System.out.println("Minimum bet is $" + minBet);
                continue;
            }
// SUBTRACT BET FROM BALANCE
            else {
                balance-=bet;
            }
           row = spinRow();
// PRINT ROW
            printRow(row);
          payout = getpayout(row,bet);
// GET PAYOUT
          if(payout>0){
              System.out.println("you won $"+payout);
              balance+=payout;
          }
          else {
              System.out.println("you lost $"+payout);
          }
// ASK TO PLAY AGAIN
            System.out.println("Do you want to play again?(Y/N)");
          playAgain = input.nextLine().toUpperCase();
          if(!playAgain.equals("Y")){
              break;
          }
        }
// DISPLAY  EXIT MESSAGE
        System.out.println("GAME OVER final balance is $"+balance);
// SPIN ROW
    }
    static String[] spinRow(){
        String[] symbols={"❤️","🔔","🌻","🎨","😭"};
        String[] row=new String[3];
        Random rand=new Random();
        for(int i=0;i<3;i++){
            row[i]=symbols[rand.nextInt(symbols.length)];

        }
        return row;
    }
    static void printRow(String[] row){
        System.out.println("***************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("***************");


    }
    static int getpayout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "❤️" -> bet * 3;
                case "🔔" -> bet * 4;
                case "🌻" -> bet * 5;
                case "🎨" -> bet * 10;
                case "😭" -> bet * 20;
                default -> 0;

            };
        } else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "❤️" -> bet * 2;
                case "🔔" -> bet * 3;
                case "🌻" -> bet * 4;
                case "🎨" -> bet * 5;
                case "😭" -> bet * 10;
                default -> 0;
            };
        } else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "❤️" -> bet * 2;
                case "🔔" -> bet * 3;
                case "🌻" -> bet * 4;
                case "🎨" -> bet * 5;
                case "😭" -> bet * 10;
                default -> 0;


            };
        }
        return 0;
    }}