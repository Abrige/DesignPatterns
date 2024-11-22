package patterns.creational.builder;

// La "classe" Item rappresenta un'interfaccia per gli oggetti
// che possono essere venduti in un ristorante.

public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
