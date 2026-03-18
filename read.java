package fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class read {
    public static void main(String[] args) throws IOException {
    String filepath="C:\\Users\\pc\\OneDrive\\Attachments\\Desktop\\jeetu.txt.txt";
    try(BufferedReader reader=new BufferedReader(new FileReader(filepath))){
        String line;
        while((line=reader.readLine())!=null){
            System.out.println(line);
        }

    }
    catch (FileNotFoundException e){
        System.out.println("File not found");

    }
    catch (IOException e){
        System.out.println("something went wrong");
    }

}}
