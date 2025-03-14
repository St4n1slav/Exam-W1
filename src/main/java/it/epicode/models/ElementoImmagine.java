package it.epicode.models;

public class ElementoImmagine extends ElementoMultimediale implements Light {

    private int luminosita = 10;

    public ElementoImmagine(String title, int luminosita) {
        super(title, 0);
        this.luminosita = luminosita;
    }

    public void show() {
        String puntiLuminosita = "";
        for (int i = 0; i < luminosita; i++) {
            puntiLuminosita += "*";
        }
        System.out.println(getTitle() + " " + puntiLuminosita);
    }

    @Override
    public void execute() {
        show();
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
