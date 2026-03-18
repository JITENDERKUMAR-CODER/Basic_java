package fileHandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStream {
    public static void main(String[] args) throws IOException {

        FileInputStream f = new FileInputStream("test.txt");
        BufferedInputStream b = new BufferedInputStream(f);
        FileOutputStream o = new FileOutputStream("jeetu.txt", true);

        int i;

        while ((i = b.read()) != -1) {
            o.write(i);
        }

        b.close();
        o.close();

        System.out.println("Data copied successfully!");
    }
}