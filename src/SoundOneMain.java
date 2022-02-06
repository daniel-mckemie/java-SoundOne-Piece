import java.io.*;
import javax.sound.sampled.*;
import java.util.Scanner;

public class SoundOneMain {
    public Clip clip;
    public void main(String[] args) {

    }
    public void loadFile() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        // Scanner scanner = new Scanner(System.in);
        File file = new File("./samples/Bell2A.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

        clip = AudioSystem.getClip();
        clip.open(audioStream);

//        String response = scanner.next();
//        response = response.toUpperCase();
//        while (!response.equals("Q")) {
//            System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
//            System.out.print("Enter your choice: ");
//
//            response = scanner.next();
//            response = response.toUpperCase();
//
//            switch(response) {
//                case ("P"): clip.start();
//                    break;
//                default: System.out.println("Not a valid response");
//            }
//        }


    }


    public void playSound() {
        System.out.println("Play!");
        System.out.println("Clip: " + clip);
        clip.start();
    }
}
