package patterns.structural.decorator;

public class DecoratorBiscotto implements Biscotto {


    private final Biscotto biscottoDecorato;

    public DecoratorBiscotto(Biscotto biscottoDecorato) {
        this.biscottoDecorato = biscottoDecorato;

    }

    @Override
    public String prepara() {
        return "";
    }
}



