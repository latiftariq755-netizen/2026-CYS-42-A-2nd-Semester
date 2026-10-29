package Week6_HTs.Task1;

public class DigitalTimer {
    private Counter hours;
    private Counter minutes;

    public DigitalTimer() {
        hours = new Counter(24);
        minutes = new Counter(60);
    }

    public DigitalTimer(int hours, int minutes) {
        this();
        set(hours, minutes);
    }

    public String toString() {
        return hours + ":" + minutes;
    }

    public void tick() {
        if (minutes.increment()) {   // minutes wrapped 59 -> 00
            hours.increment();       // so bump the hour (23 -> 00 handled by Counter)
        }
    }

    public void set(int hours, int minutes) {
        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59)
            throw new IllegalArgumentException("Need 0<=hours<=23 and 0<=minutes<=59");
        this.hours.set(hours);
        this.minutes.set(minutes);
    }
}