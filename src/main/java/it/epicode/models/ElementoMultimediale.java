package it.epicode.models;

public abstract class ElementoMultimediale {

    private String title;
    private int durata;

    public ElementoMultimediale(String titolo, int durata) {
        this.title = titolo;
        this.durata = durata;
    }

    public int getDurata() {
        return durata;
    }

    public String getTitle() {
        return title;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void execute();

    public void Media(String title, int durata) {
        this.title = title;
    }
}
