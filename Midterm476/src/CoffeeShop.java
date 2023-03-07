public class CoffeeShop {
    CoffeeFactory factory;
    public CoffeeShop(CoffeeFactory factory) {this.factory = factory;}
    public Coffee orderCoffee(int type) {
        Coffee coffee;
        coffee = factory.create(type);
        coffee.show();
        return coffee;
    }
}
