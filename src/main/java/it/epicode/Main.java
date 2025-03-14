package it.epicode;

import it.epicode.models.ElementoAudio;
import it.epicode.models.ElementoImmagine;
import it.epicode.models.ElementoMultimediale;
import it.epicode.models.ElementoVideo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        //Ho fatto la lista anzichè l'arrey
        List<ElementoMultimediale> elementi = new ArrayList<>();

        for (int i = 0; i < 1; i++) {
            leggiInput(myObj, elementi);
        }
        while (true) {
            System.out.println("Quale elemento vuoi eseguire? (da 1 a 5)");
            int input = myObj.nextInt();
            if (input == 0) {
                break;
            }
            elementi.get(input - 1).execute();
        }
    }

    private static void leggiInput(Scanner myObj, List<ElementoMultimediale> elementi) {
        System.out.println("Quale elemento vuoi inserire? (Audio, Immagine o Video)");
        String input = myObj.nextLine();
        if (input.equalsIgnoreCase("Audio")) {
            System.out.println("Inserire titolo, durata e volume");
            String titolo = myObj.nextLine();
            int durata = myObj.nextInt();
            int volume = myObj.nextInt();
            ElementoAudio audio = new ElementoAudio(titolo, durata, volume);
            elementi.add(audio);
        } else if (input.equalsIgnoreCase("Immagine")) {
            System.out.println("Inserire titolo, luminosita");
            String titolo = myObj.nextLine();
            int luminosita = myObj.nextInt();
            ElementoImmagine immagine = new ElementoImmagine(titolo, luminosita);
            elementi.add(immagine);
        } else if (input.equalsIgnoreCase("Video")) {
            System.out.println("Inserire titolo, durata, volume e luminosita");
            String titolo = myObj.nextLine();
            int durata = myObj.nextInt();
            int volume = myObj.nextInt();
            int luminosita = myObj.nextInt();
            ElementoVideo video = new ElementoVideo(titolo, durata, volume, luminosita);
            elementi.add(video);
        } else {
            System.out.println("Elemento non valido");
        }
    }
}