public class CoffeeFactory {

    public Coffee create(int type) {
        Coffee order = null;

        if (type == 1) {
            order = Order1.Instance();
        } else if (type == 2) {
            order = Order2.Instance();
        }

        return order;
    }

}
