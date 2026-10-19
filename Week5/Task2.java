package Week5;

import java.util.Scanner;

class Walls {
    String flavor;
    int scoops;
    String coneType;
    double price;

    // Default Constructor
    public Walls() {
        this.flavor = "Vanilla";
        this.scoops = 1;
        this.coneType = "Sugar";
        calculatePrice();
    }

    // Parameterized Constructor
    public Walls(String flavor, int scoops, String coneType) {
        this.flavor = flavor;
        this.scoops = scoops;
        this.coneType = coneType;
        calculatePrice();
    }

    // Calculate price method
    public void calculatePrice() {
        double base = scoops * 75.0;
        if (coneType.equalsIgnoreCase("Waffle")) {
            base += 40.0;
        }
        this.price = base;
    }

    public void displayOrder() {
        System.out.println("\n--- Order Summary ---");
        System.out.println("Flavor: " + flavor);
        System.out.println("Scoops: " + scoops);
        System.out.println("Cone Type: " + coneType);
        System.out.println("Total Price: Rs. " + price);
    }
}

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Flavor:");
        System.out.println("1. Chocolate\n2. Vanilla\n3. Strawberry\n4. Mango\n5. Tutti Fruit\n6. Almond Crunch\n7. Coffee");
        int fChoice = sc.nextInt();

        String flavor;
        switch (fChoice) {
            case 1: flavor = "Chocolate"; break;
            case 2: flavor = "Vanilla"; break;
            case 3: flavor = "Strawberry"; break;
            case 4: flavor = "Mango"; break;
            case 5: flavor = "Tutti Fruit"; break;
            case 6: flavor = "Almond Crunch"; break;
            case 7: flavor = "Coffee"; break;
            default: flavor = "Vanilla";
        }

        System.out.print("Enter number of scoops: ");
        int scoops = sc.nextInt();

        System.out.println("Select Cone Type:\n1. Sugar Cone\n2. Waffle Cone");
        int cChoice = sc.nextInt();
        String coneType = (cChoice == 2) ? "Waffle" : "Sugar";

        Walls myIceCream = new Walls(flavor, scoops, coneType);
        myIceCream.displayOrder();

        sc.close();
    }
}