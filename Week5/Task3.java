package Week5;

class Product {
    // Private data members
    private String name;
    private int price;
    private int quantity;

    // Static variable
    private static int totalProduct = 0;

    // Default constructor
    public Product() {
        name = "";
        price = 0;
        quantity = 0;
        counter();
    }

    // Parameterized constructor
    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        counter();
    }

    // Input product data
    public void getData() {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter product name: ");
        name = input.nextLine();

        System.out.print("Enter product price: ");
        price = input.nextInt();

        System.out.print("Enter product quantity: ");
        quantity = input.nextInt();
    }

    // Increment product counter
    public static void counter() {
        totalProduct++;
    }

    // Return total number of products
    public static int countProduct() {
        return totalProduct;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000, 2);
        Product p2 = new Product("Mouse", 1000, 5);
        Product p3 = new Product("Keyboard", 2000, 3);
        Product p4 = new Product();
        Product p5 = new Product();

        System.out.println("Total products created: "
                + Product.countProduct());
    }
}