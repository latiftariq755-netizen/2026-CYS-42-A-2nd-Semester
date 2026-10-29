package Week6_HTs.Task2;

public abstract class Walker {
    protected String name;
    protected int x = 0, y = 0;
    protected Grid grid;          // association: every walker knows the grid it walks on

    public Walker(String name, Grid grid) {
        this.name = name;
        this.grid = grid;
    }

    // Tries to move by (dx, dy). Blocked by obstacles.
    protected boolean step(int dx, int dy) {
        int nx = x + dx, ny = y + dy;
        if (grid.isObstacle(nx, ny)) {
            System.out.println(name + " encounters hurdle at [" + nx + ":" + ny + "]");
            return false;
        }
        x = nx;
        y = ny;
        return true;
    }

    public String toString() { return name + " is at = " + x + " : " + y; }
}