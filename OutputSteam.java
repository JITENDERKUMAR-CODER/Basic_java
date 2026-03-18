package fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputSteam {
    public static void main(String[] args) throws IOException {


        FileInputStream f = new FileInputStream("test.txt");
        FileOutputStream fo = new FileOutputStream("jeetu.txt", true);
    int i;


        while ((i = f.read()) != -1) {
            fo.write(i);
        System.out.print((char) i);
    }

        fo.close();
        f.close();
}
}
