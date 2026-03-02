import java.util.Scanner;

public class TCFt {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age!");
        int age = input.nextInt();
        try{
        if(age<15) {
            throw new ArithmeticException("invalid age ");
        }
        else {
            System.out.println("you are eligible");
        }

        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.printf("code exit");
        }}}