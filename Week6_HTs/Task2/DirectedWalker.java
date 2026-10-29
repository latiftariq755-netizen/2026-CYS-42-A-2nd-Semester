package Week6_HTs.Task2;

public class DirectedWalker extends Walker {
    public DirectedWalker(String name, Grid grid) { super(name, grid); }

    // ^ up, v down, < left, > right
    public void move(char dir) {
        switch (dir) {
            case '^': step(0, 1); break;
            case 'v': step(0, -1); break;
            case '<': step(-1, 0); break;
            case '>': step(1, 0); break;
            default: System.out.println("Invalid direction, use ^ v < >");
        }
    }
}