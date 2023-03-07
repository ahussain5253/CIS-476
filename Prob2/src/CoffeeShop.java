public class CoffeeShop {

    // give CarStore a reference to a SimpleCarFactory
    CoffeeFactory factory;

    // CarStore gets the factory passed to it in the constructor
    public CoffeeShop(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderMeal(int type) {
        //use factory to create its meal by simply passing on the type of the order
        Coffee meal;
        meal = factory.create(type);
        meal.show();
        return meal;
    }
}
