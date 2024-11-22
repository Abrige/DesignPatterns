package patterns.creational.builder;

public class Wrapper implements Packing {

    @Override
    public int getSize() {
        return 30;
    }

    @Override
    public int getWeight() {
        return 80;
    }
    @Override
    public int getVolume() {
        return 10;
    }

    @Override
    public String getName() {
        return "Wrapper Burger";
    }


}
