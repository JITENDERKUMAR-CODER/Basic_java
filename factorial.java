import java.util.Scanner;
public class factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter number");
         long fact=1;

        for (int i=1;i<=n;i++) {

            fact *= i;



                System.out.println("factorial="+fact);

                }
            }
        }