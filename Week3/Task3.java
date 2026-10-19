package Week3;

import java.util.Scanner;
import java.util.Random;

public class Task3 {

    // Class to store a person's location
    static class Position {
        int x;
        int y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + " : " + y + ")";
        }
    }

    // Move one step in the selected direction
    static Position move(Position current, char direction) {
        int x = current.x;
        int y = current.y;

        switch (direction) {
            case '^':
                y++;
                break;

            case 'v':
                y--;
                break;

            case '>':
                x++;
                break;

            case '<':
                x--;
                break;
        }

        return new Position(x, y);
    }

    // Check whether a location contains an obstacle
    static boolean isObstacle(Position p) {
        // Example obstacles
        return (p.x == 1 && p.y == 2)
                || (p.x == 2 && p.y == 2)
                || (p.x == -1 && p.y == 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        Position ali = new Position(0, 0);
        Position hasan = new Position(0, 0);

        // Hasan can randomly choose any of these directions
        char[] directions = {'^', 'v', '<', '>'};

        System.out.println("Starting:");
        System.out.println("Ali's Location is = " + ali);
        System.out.println("Hasan's Location is = " + hasan);
        System.out.println(
                "Hasan has Random Movement, Ali follows order"
        );

        while (true) {
            System.out.print(
                    "\nAli: Where should I go? "
                            + "(^, v, <, > or q to quit): "
            );

            char direction = input.next().charAt(0);

            if (direction == 'q' || direction == 'Q') {
                break;
            }

            if ("^v<>".indexOf(direction) == -1) {
                System.out.println("Invalid direction!");
                continue;
            }

            // Ali attempts to move
            Position nextAli = move(ali, direction);

            if (isObstacle(nextAli)) {
                System.out.println(
                        "Ali encounters hurdle at " + nextAli
                );
            } else {
                ali = nextAli;
            }

            System.out.println("Ali is at = " + ali);

            // Hasan attempts a random move
            char hasanDirection =
                    directions[random.nextInt(directions.length)];

            Position nextHasan = move(hasan, hasanDirection);

            if (isObstacle(nextHasan)) {
                System.out.println(
                        "Hasan encounters hurdle at " + nextHasan
                );
            } else {
                hasan = nextHasan;
            }

            System.out.println("Hasan is at = " + hasan);
        }

        System.out.println("Walking simulation ended.");
        input.close();
    }
}

