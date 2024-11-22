package patterns.structural.bridge;

public abstract class Forma {

    protected Colore colore;

    public Forma(Colore colore) {
        this.colore = colore;
    }

    public abstract void disegna();

    public Colore colore() {
        return null;
    }
}
