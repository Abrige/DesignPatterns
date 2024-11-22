package patterns.structural.bridge;

public class Cerchio extends Forma{

    public Cerchio(Colore colore) {
        super(colore);
    }

    @Override
    public void disegna() {
        System.out.println("Disegno un cerchio");
    }
}
