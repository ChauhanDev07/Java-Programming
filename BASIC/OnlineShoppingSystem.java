class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

class Product {
    private String name;
    private int available;

    public Product(String name, int available) {
        this.name = name;
        this.available = available;
    }

    public void buyProduct(int quantity) throws OutOfStockException {
        if (quantity > available) {
            throw new OutOfStockException(" " + available + " items left.");
        } else {
            available -= quantity;
            System.out.println("order placed " + quantity );
            System.out.println("remaining stock: " + available);
        }
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Product laptop = new Product("laptop", 5);

        try {
            laptop.buyProduct(1);
            laptop.buyProduct(500);
        } catch (OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
