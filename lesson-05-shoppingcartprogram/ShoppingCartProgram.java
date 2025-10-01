import java.util.Scanner;
public class ShoppingCartProgram {
    public static void main(String[] args) {

        //SHOPPING CART PROGRAM

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("What item would you like to buy?");
        item = scanner.nextLine();

        System.out.println("What is the price for each?");
        price = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("How many would you like?");
        quantity = scanner.nextInt();
        scanner.nextLine();

        total = price * quantity;

        System.out.println("You have bought " + quantity + " " + item + " (s). " + "Your total is " + currency + total + ".");
    }
}
