package main.audio;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Audio {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner scanner = new Scanner(System.in);

        File file = new File("test_audio.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

        String response = "";

        while(!response.equals("Q")){
            System.out.println("P = play, S = stop, R = reset, Q = quit");
            System.out.print("Enter your choice:");

            response = scanner.next();
            response = response.toUpperCase();

            switch (response){
                case ("P"):   clip.start();
                break;
                case ("S"):   clip.stop();
                break;
                case ("R"):   clip.setMicrosecondPosition(0); clip.start();
                break;
                case ("Q"):   clip.close();
                break;
                default: System.out.println("Not valid");
            }
        }
        clip.start();
    }
}
