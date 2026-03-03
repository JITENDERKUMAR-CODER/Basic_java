package projects;

import javax.sound.sampled.*;
import java.io.*;
import java.util.Scanner;


public class autoSong {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        String filepath = "kalank (1).wav";
        File file = new File(filepath);
        System.out.println(file.getAbsolutePath()); // Debug line
try(Scanner scanner=new Scanner(System.in);
    AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(file)){
    Clip clip= AudioSystem.getClip();
    clip.open(audioInputStream);
    String response="";
while (!response.equals("Q")){
    System.out.println("P=play");
    System.out.println("S=Stop");
    System.out.println("R=reset");
    System.out.println("Q=Quit");
    System.out.print("Enter your choice: ");
    response=scanner.next().toUpperCase();
switch(response){
    case "P"-> clip.start();
    case "S"-> clip.stop();
    case "R"->clip.setMicrosecondPosition(0);
    case "Q"-> clip.close();
    default -> System.out.println("Wrong choice");
}

}
}
catch (FileNotFoundException e) {
    System.out.println("File not found");
}
catch (UnsupportedAudioFileException e){
    System.out.println("Audio file not supported");
}
catch (LineUnavailableException e){
    System.out.println("Audio line unavailable");
}
catch (IOException e){
    System.out.println("something went wrong");

}
finally {
    System.out.println("Bye!");
}
    }
}
