
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PizzaMaker pizzaMaker;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter pizza name: ");
        String name = input.nextLine();
        if (name.equals("Cheese Pizza")) {
            pizzaMaker = new CheesePizzaMaker();
        } else if (name.equals("Chicken Pizza")) {
            pizzaMaker = new ChickenPizzaMaker();
        } else {
            pizzaMaker = null;
        }

        if (pizzaMaker != null) {
            pizzaMaker.pizzaShop();
            pizzaMaker.pizzaMake().pizzaType();
            pizzaMaker.pizzaMake().addElements();
        } else {
            System.out.println("No such pizza available.");
        }


    }
}
