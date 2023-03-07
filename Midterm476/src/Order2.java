public class Order2 extends Coffee {
    protected Order2() {
        Type = "Cappuccino";
        Size = "Small";
        Extras = "Extra sugar, No cream";
    }
    public static Coffee Instance() {
        if (instance == null) {
            instance = new Order2();
        }
        return instance;
    }
}
