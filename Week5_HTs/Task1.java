package Week5_HTs;

class dayType {
    private String day;
    private static final String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

    // Default constructor
    public dayType() {
        this.day = "Sun";
    }

    // Parameterized constructor
    public dayType(String day) {
        setDay(day);
    }

    // a. Set the day
    public void setDay(String day) {
        for (String d : days) {
            if (d.equalsIgnoreCase(day)) {
                this.day = d;
                return;
            }
        }
        System.out.println("Invalid day entered. Defaulting to Sun.");
        this.day = "Sun";
    }

    // b. Print the day
    public void printDay() {
        System.out.println("Day: " + day);
    }

    // c. Return the day
    public String getDay() {
        return day;
    }

    // Helper method to find index of current day
    private int getIndex() {
        for (int i = 0; i < days.length; i++) {
            if (days[i].equalsIgnoreCase(day)) {
                return i;
            }
        }
        return 0;
    }

    // d. Return the next day
    public String nextDay() {
        int idx = getIndex();
        return days[(idx + 1) % 7];
    }

    // e. Return the previous day
    public String prevDay() {
        int idx = getIndex();
        return days[(idx - 1 + 7) % 7];
    }

    // f. Calculate and return the day by adding certain days
    public String addDays(int n) {
        int idx = getIndex();
        int newIdx = (idx + (n % 7) + 7) % 7;
        return days[newIdx];
    }
}

// Test class
public class Task1 {
    public static void main(String[] args) {
        dayType today = new dayType("Mon");
        today.printDay();

        System.out.println("Next day: " + today.nextDay());
        System.out.println("Previous day: " + today.prevDay());

        System.out.println("Adding 4 days to Monday: " + today.addDays(4)); // Should be Friday

        dayType t2 = new dayType("Tue");
        System.out.println("Adding 13 days to Tuesday: " + t2.addDays(13)); // Should be Monday
    }
}
