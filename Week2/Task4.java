package Week2;

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Minutes:");
        int m = sc.nextInt();
        int T=m;
        int totalhours=T/60;
        int b=T%60;
        int c=totalhours%24;
        System.out.println("Minutes by user:"+m);
        System.out.println("Total Minutes:"+T);
        System.out.println("Totalhours:"+totalhours);
        System.out.println("Hours="+c+","+ "Minutes="+b);
        sc.close();
    }
    
}
 
