package Week2;

import java.util.Scanner;

public class Task6 {
   public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int[] arr= {2,4,5,3,6,32,78,6,54,9,8,12};
       System.out.print("Enter Start Index:");
       int s = sc.nextInt();
       System.out.print("Enter Stop Index:");
       int e= sc.nextInt();
       for(int i=s;i<=e;i=i+2){
           System.out.println("Index"+i+"="+" "+arr[i]);
       }
       sc.close();
    }
}
 
