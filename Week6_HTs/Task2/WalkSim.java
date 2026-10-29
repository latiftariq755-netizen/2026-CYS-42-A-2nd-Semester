package Week6_HTs.Task2;

import java.util.Scanner;

public class WalkSim {
    public static void main(String[] args) {
        Grid grid = new Grid();               // same obstacles for both walkers
        grid.addObstacle(1, 2);
        grid.addObstacle(-1, 1);
        grid.addObstacle(0, -3);

        DirectedWalker ali = new DirectedWalker("Ali", grid);
        RandomWalker hasan = new RandomWalker("Hasan", grid);

        System.out.println("Starting: Ali's Location is = 0 : 0   Hasan's Location is = 0 : 0");
        System.out.println("Hasan has Random Movement, Ali follows order");

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\nALi: Where should i go now (^ v < >, q to quit): ");
            String line = sc.nextLine().trim();
            if (line.equalsIgnoreCase("q") || line.isEmpty()) break;

            ali.move(line.charAt(0));
            System.out.println(ali);
            hasan.move();
            System.out.println(hasan);
        }
        System.out.println("Simulation ended.");
        sc.close();
    }
}