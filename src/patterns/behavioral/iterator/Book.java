package patterns.behavioral.iterator;

public class Book {
    private String tipologia;
    private String titolo;

    public Book(String tipologia, String titolo) {
        this.tipologia = tipologia;
        this.titolo = titolo;
    }

    public String getTipologia() {
        return tipologia;
    }

    public String getTitolo() {
        return titolo;
    }
}
