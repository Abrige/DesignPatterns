package patterns.structural.bridge;

public class Quadrato extends Forma{

    private int lato;

    public Quadrato(int lato, Colore colore){
        super(colore);
        this.lato = lato;
    }

    @Override
    public void disegna() {
        System.out.println("Quadrato - ");
        colore.applicaColore();
    }
}
