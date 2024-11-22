package patterns.creational.builder;

import java.util.List;

public class Meal {
    private List<Item> items;

    public void addItem(Item item) {
        items.add(item);
    }
    public float getCost() {
        //TODO implement
        return 0;
    }
    public void showItems(){
        for(Item a : this.items){
            System.out.println("Item : " + a.name());
            System.out.println("Price : " + a.price());
        }
    }
}
