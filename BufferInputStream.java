package fileHandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferInputStream {
    public static void main(String[] args) throws IOException {

        FileInputStream f = new FileInputStream("test.txt");
        BufferedInputStream b = new BufferedInputStream(f);
        int i;

        while ((i = b.read()) != -1) {
            System.out.print((char) i);
        }

        b.close();  // close buffer (it will close f also)
    }
}