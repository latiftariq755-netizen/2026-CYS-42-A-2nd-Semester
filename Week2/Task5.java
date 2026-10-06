package Week2;

import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int[] n = {2, 4, 5, 3, 6, 32, 78, 6, 54, 9, 8, 12};
        System.out.print("Index Start Number:");
        int s = a.nextInt();
        System.out.print("Index Stop Number:");
        int e = a.nextInt();
        System.out.print("Enter Increment number:");
        int I = a.nextInt();
        for (int i = s; i < e; i = i + I) {
            System.out.println(n[i]);

        }
        a.close();
    }
}


