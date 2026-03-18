package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class write {
    public static void main(String[] args) {
        String filepath="test.txt";
        String textcontent="i like burger";

        try(FileWriter writer =new FileWriter(filepath)){
            writer.write(textcontent);
            System.out.println("file has been written");


        }
        catch (FileNotFoundException e){
            System.out.println("file not found");
        }
        catch (IOException e){
            System.out.println("could not write file");
        }
    }
}
