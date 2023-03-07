import java.util.Scanner;

public class Customer {

    public static void main(String[] args) {

        CoffeeFactory factory = new CoffeeFactory();
        CoffeeShop shop = new CoffeeShop(factory);

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Welcome, what would you like to order? Please choose 1 or 2. \n");

        int uInput = myObj.nextInt();  // Read user input

        Coffee coffee;
        if (uInput == 1) {
            System.out.println("Order 1:");
            coffee = shop.orderMeal(1);
        } else if (uInput == 2) {
            System.out.println("Order 2:");
            coffee = shop.orderMeal(2);
        } else {
            System.out.println("Sorry, we only have two types of coffee.\n");
        }

    }
}
