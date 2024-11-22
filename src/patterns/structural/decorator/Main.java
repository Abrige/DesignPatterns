package patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {

        //creazione di un biscotto base
        Biscotto biscotto = new BiscottoBase();
        System.out.println(biscotto.prepara());

        Biscotto biscottoConGlassaENocciole = new GranellaNoccioleDecorator(new GlassaCioccolatoDecorator(biscotto));

    }
}
