package Week2;

import java.util.Scanner;

public class Task2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Your name: ");
        String name = sc.nextLine();

        System.out.print("Your roll No: ");
        int roll_no = sc.nextInt();

        System.out.println(name);
        System.out.println(roll_no);
        sc.close();
    }    
}
