package projects;

import javax.sound.sampled.*;
import java.io.*;
import java.util.Scanner;

public class autoSong {
    public static void main(String[] args) {

        String filepath = null;

        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter song name: ");
            String userSong = input.nextLine().toLowerCase();

            Scanner fileReader = new Scanner(new File("songs/songs.txt"));


            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split("=");

                if (parts[0].trim().equalsIgnoreCase(userSong)) {
                    filepath = parts[1].trim();
                    break;
                }
            }
            fileReader.close();

            if (filepath == null) {
                System.out.println("Song not found!");
                return;
            }


            File file = new File("songs/" + filepath);

            System.out.println("Looking in: " + file.getAbsolutePath());

            AudioInputStream audioInputStream =
                    AudioSystem.getAudioInputStream(file);

            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);

            String response = "";
            Scanner scanner = new Scanner(System.in);

            while (!response.equals("Q")) {
                System.out.println("\nP = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Choice: ");

                response = scanner.next().toUpperCase();

                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> {
                        clip.stop();
                        clip.setMicrosecondPosition(0);
                    }
                    case "Q" -> clip.close();
                    default -> System.out.println("Wrong choice");
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Bye!");
    }
}