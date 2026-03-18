/*
Scanner → input

PrintWriter → output

Used for simple programs
 */

package fileHandling;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class printWriter{


    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        PrintWriter pw = new PrintWriter("jeetu.txt");
        String data = input.nextLine();
        pw.write(data);
        pw.close();

    }

}
