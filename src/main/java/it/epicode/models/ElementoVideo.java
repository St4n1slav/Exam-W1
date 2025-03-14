package it.epicode.models;

public class ElementoVideo extends ElementoMultimediale implements Riproducibile, Light {

    private int volume = 5;
    private int luminosita = 5;

    @Override
    public void execute() {
        play();
    }

    public ElementoVideo(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata);
        this.volume = volume;
        this.luminosita = luminosita;
    }

    @Override
    public void play() {
        String puntiVolume = "";
        for (int i = 0; i < volume; i++) {
            puntiVolume += "!";
        }
        String puntiLuminosita = "";
        for (int i = 0; i < luminosita; i++) {
            puntiLuminosita += "*";
        }
        for (int i = 0; i < getDurata(); i++) {
            System.out.println(getTitle() + " " + puntiVolume + " " + puntiLuminosita);
        }
    }

    @Override
    public void abbassaVolume() {
        volume--;
    }

    @Override
    public void alzaVolume() {
        volume++;
    }

    @Override
    public void aumentaLuminosita() {
        luminosita++;
    }

    @Override
    public void abbassaLuminosita() {
        luminosita--;
    }

}
