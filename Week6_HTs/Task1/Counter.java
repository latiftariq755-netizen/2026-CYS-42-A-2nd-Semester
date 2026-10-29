package Week6_HTs.Task1;

public class Counter {
    private int value;
    private final int limit;          // counts 0 .. limit-1

    public Counter(int limit) {
        if (limit < 1) throw new IllegalArgumentException("limit must be >= 1");
        this.limit = limit;
        this.value = 0;
    }

    // adds 1, wraps to 0 at the limit; returns true if it wrapped
    public boolean increment() {
        value = (value + 1) % limit;
        return value == 0;
    }

    public void set(int v) {
        if (v < 0 || v >= limit)
            throw new IllegalArgumentException("value must be 0 to " + (limit - 1));
        value = v;
    }

    public int get() { return value; }

    @Override
    public String toString() { return String.format("%02d", value); }
}