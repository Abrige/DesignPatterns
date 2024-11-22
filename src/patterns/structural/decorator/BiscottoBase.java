package patterns.structural.decorator;

public class BiscottoBase implements Biscotto{

    public BiscottoBase() {
    }

    @Override
    public String prepara() {
        return "Biscotto base preparato";
    }
}
