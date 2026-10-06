package Week2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter no of Minutes:");
       int min = sc.nextInt();
       int hours = min/60;
       int remaining_mins= min%60;
       System.out.print(min + " " + "minutes,"+" "+hours+" "+"hours,"+" "+remaining_mins+" "+"minutes"+" ");
       System.out.print("total hours"+(min/60.0));
       sc.close();

    }
}
