package Week6_HTs.Task1;

public class TimerDriver {
    public static void main(String[] args) {
        DigitalTimer t = new DigitalTimer();
        System.out.println("Default: " + t);

        t = new DigitalTimer(13, 45);
        System.out.println("Set 13:45: " + t);

        t.set(9, 5);
        System.out.println("Set 09:05: " + t);

        t.set(9, 59);
        t.tick();
        System.out.println("09:59 + tick = " + t);

        t.set(23, 59);
        t.tick();
        System.out.println("23:59 + tick = " + t);

        try {
            new DigitalTimer(24, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught bad hours: " + e.getMessage());
        }
        try {
            t.set(10, 60);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught bad minutes: " + e.getMessage());
        }
    }
}