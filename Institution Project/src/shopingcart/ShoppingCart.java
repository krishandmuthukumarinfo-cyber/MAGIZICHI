package shopingcart;

public class ShoppingCart {

    String cartOwnerName;

    class Item {

        String itemName;
        double price;
        int quantity;
        double[] priceHistory;

        void addItem(String name, int qty) {
            itemName = name;
            quantity = qty;
        }

        void updatePriceHistory(double[] prices) {
            priceHistory = prices;
        }

        void calculateTotalBill() {

            // Last value is the latest price
            price = priceHistory[priceHistory.length - 1];

            double total = price * quantity;

            System.out.println("\nLatest Price : " + price);
            System.out.println("Total Bill   : " + total);
        }

        void display() {

            System.out.println("\n**********************");
            System.out.println(" CART DETAILS");
            System.out.println("**********************");

            System.out.println("Cart Owner   : " + cartOwnerName);
            System.out.println("Item Name    : " + itemName);
            System.out.println("Quantity     : " + quantity);

            System.out.print("Price History: ");

            for (int i = 0; i < priceHistory.length; i++) {
                System.out.print(priceHistory[i] + " ");
            }

            System.out.println();

            System.out.println("Latest Price : " + price);
            System.out.println("Total Bill   : " + (price * quantity));
        }
    }
}