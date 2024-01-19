import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lec22_Audio {

    public static void Lec1() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        File file = new File("/Users/hatuongnguyen/Desktop/Computer/Coding/Java/LearnJava/Lec22_Helium - TrackTribe.wav");

        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        clip.start();

        Scanner scanner = new Scanner(System.in);
        String message = "";


        while (!message.equalsIgnoreCase("q")) {
            System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
            System.out.print("Enter your choice: ");

            message = scanner.next();
            message = message.toLowerCase();

            switch (message) {
                case ("p"):
                    clip.start();
                    break;
                case ("s"):
                    clip.stop();
                    break;
                case ("r"):
                    clip.setMicrosecondPosition(0);
                    break;
                case ("q"):
                    clip.close();
                    break;
                default:
                    System.out.println("Not a valid response!");
            }
        }

        clip.close();
    }
}
