public class Order1 extends Coffee {
    protected Order1() {
        Type = "Latte";
        Size = "Medium";
        Extras = "No sugar, Extra shot";
    }
    public static Coffee Instance() {
        if (instance == null) {
            instance = new Order1();
        }
        return instance;
    }
}
