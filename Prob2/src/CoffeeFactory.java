public class CoffeeFactory {

    public Coffee create(int type) {
        Coffee coffee=null;
        if (type == 1) {
           coffee = Order1.Instance();
        }
        else if (type == 2) {
            coffee = Order2.Instance();
        }
        return coffee;
    }
}


