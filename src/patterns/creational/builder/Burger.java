package patterns.creational.builder;

public abstract class Burger implements Item {
    public String name() {
        return "Burger Abstract";
    }

    @Override
    public Packing packing() {
        //TODO implement me
        return null;
    }

    @Override
    public float price() {
        //TODO implement me
        return 10;
    }
}
