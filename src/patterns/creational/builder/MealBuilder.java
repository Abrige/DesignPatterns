package patterns.creational.builder;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new Pepsi());
        meal.addItem(new VegBurger());
        return meal;
    }
    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new Coke());
        return meal;
    }
}
