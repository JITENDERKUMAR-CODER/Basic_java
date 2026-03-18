package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamExample {

    public static void main(String[] args) throws IOException {

        FileInputStream f = new FileInputStream("test.txt");
        int i;

        while ((i = f.read()) != -1) {
            System.out.print((char) i);
        }

        f.close();
    }
}