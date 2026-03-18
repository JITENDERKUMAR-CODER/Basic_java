package fileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterSteam {
    public static void main(String[] args) throws IOException {
    FileReader fr = new FileReader("test.txt");
    FileWriter fw = new FileWriter("out.txt");

    int i;
while((i = fr.read()) != -1){
        fw.write(i);
    }
}}
