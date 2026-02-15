import java.util.Scanner;

public class statement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number ");
        int n = sc.nextInt();
        if (n>=18) {
            System.out.println("you are adult");
        }else if(n<18) {
                System.out.println("you are not adult");
            }
else{
            System.out.println("wrong entry!");

        }
        }

    }
