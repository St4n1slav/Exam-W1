package it.epicode.models;

public class ElementoAudio extends ElementoMultimediale implements Riproducibile {

    private int volume = 10;

    public ElementoAudio(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void play() {
        String puntiVolume = "";
        for (int i = 0; i < volume; i++) {
            puntiVolume += "!";
        }
        for (int i = 0; i < getDurata(); i++) {
            System.out.println(getTitle() + " " + puntiVolume);
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
    public void execute() {
        play();
    }

}
