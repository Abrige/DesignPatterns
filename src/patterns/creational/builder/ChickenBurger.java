package patterns.creational.builder;

public class ChickenBurger extends Burger{

    public ChickenBurger(Wrapper wrapper) {
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public Packing packing() {
        return super.packing();
    }

    @Override
    public float price() {
        return 2.14f;
    }
}
