import java.util.*;

class Item {
    String name;
    double price;

    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Item> cart = new ArrayList<>();

        System.out.println("=== 🛒 SIMPLE SHOPPING CART SYSTEM ===");

        while (true) {
            System.out.println("\n1. Add Item");
            System.out.println("2. View Cart");
            System.out.println("3. Checkout");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter item name: ");
                String name = sc.next();
                System.out.print("Enter item price: ");
                double price = sc.nextDouble();
                cart.add(new Item(name, price));
                System.out.println("✅ " + name + " added to cart.");
            } else if (ch == 2) {
                System.out.println("\nYour Cart:");
                double total = 0;
                for (Item i : cart) {
                    System.out.println(i.name + " - ₹" + i.price);
                    total += i.price;
                }
                System.out.println("Total: ₹" + total);
            } else if (ch == 3) {
                double total = 0;
                for (Item i : cart) total += i.price;
                System.out.println("\n🧾 Final Amount: ₹" + total);
                System.out.println("🎉 Thank you for shopping!");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}
