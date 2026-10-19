package Week3;

public class JTime {

    // Attributes
    private int hour;
    private int minute;
    private int second;

    // Constructor 1: Default constructor
    public JTime() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    // Constructor 2: Initialize hours, minutes, and seconds
    public JTime(int h, int m, int s) {
        int totalSeconds = h * 3600 + m * 60 + s;
        totalSeconds = Math.floorMod(totalSeconds, 86400);

        hour = totalSeconds / 3600;
        minute = (totalSeconds % 3600) / 60;
        second = totalSeconds % 60;
    }

    // Constructor 3: Copy constructor
    public JTime(JTime other) {
        hour = other.hour;
        minute = other.minute;
        second = other.second;
    }

    // Part (c): Constructor using total seconds after midnight
    public JTime(long totalSeconds) {
        totalSeconds = Math.floorMod(totalSeconds, 86400);

        hour = (int) (totalSeconds / 3600);
        minute = (int) ((totalSeconds % 3600) / 60);
        second = (int) (totalSeconds % 60);
    }

    // Convert this timestamp to total seconds
    public int toSeconds() {
        return hour * 3600 + minute * 60 + second;
    }

    // Part (a): Calculate elapsed time in seconds
    public int elapsedSeconds(JTime other) {
        return Math.floorMod(
                other.toSeconds() - this.toSeconds(),
                86400
        );
    }

    // Part (b): Return elapsed time as another JTime object
    public JTime elapsedTime(JTime other) {
        return new JTime(elapsedSeconds(other));
    }

    // Display time in HH:MM:SS format
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",
                hour, minute, second);
    }

    // Main method: Test all three parts
    public static void main(String[] args) {

        JTime start = new JTime(10, 20, 30);
        JTime end = new JTime(12, 45, 50);

        System.out.println("Start time: " + start);
        System.out.println("End time: " + end);

        // Part (a)
        int seconds = start.elapsedSeconds(end);
        System.out.println(
                "Elapsed time in seconds: " + seconds
        );

        // Part (b)
        JTime difference = start.elapsedTime(end);
        System.out.println(
                "Elapsed time as JTime: " + difference
        );

        // Part (c)
        JTime t = new JTime(3661);
        System.out.println(
                "3661 seconds after midnight: " + t
        );

        // Extra test: Crossing midnight
        JTime night = new JTime(23, 59, 30);
        JTime morning = new JTime(0, 0, 30);

        System.out.println(
                "Across midnight: "
                        + night.elapsedSeconds(morning)
                        + " seconds"
        );
    }
}
