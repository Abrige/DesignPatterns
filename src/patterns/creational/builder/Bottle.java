package patterns.creational.builder;

public class Bottle implements Packing{
    @Override
    public int getSize() {
        return 20;
    }

    @Override
    public int getWeight() {
        return 50;
    }
    @Override
    public int getVolume() {
        return 30;
    }

    @Override
    public String getName() {
        return "";
    }
}
