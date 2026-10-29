package Week6_HTs.Task2;

import java.util.Random;

public class RandomWalker extends Walker {
    private Random rand = new Random();

    public RandomWalker(String name, Grid grid) { super(name, grid); }

    public void move() {
        switch (rand.nextInt(4)) {
            case 0: step(0, 1); break;
            case 1: step(0, -1); break;
            case 2: step(-1, 0); break;
            default: step(1, 0);
        }
    }
}
