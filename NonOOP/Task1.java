package NonOOP;


// --------------------------------->TASK:1<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//    public static void main() {
//        Scanner n = new Scanner(System.in);
//        System.out.print("Enter an integer:");
//        int a = n.nextInt();
//
//        if ((a & 1) == 1) {
//            System.out.println("The number " +a+ " is Odd");
//        }
//        else {
//            System.out.println("The number " +a+ " is Even");
//        }
//    }
//}


// --------------------------------->TASK:2<---------------------------------

//public class Task1 {
//    static void main() {
//        int a = 10;
//        int b = 20;
//
//        System.out.println("Value of a before swapping is: "+a);
//        System.out.println("Value of b before swapping is: "+b);
//
//        a = a + b;
//        b = a - b;
//        a = a - b;
//
//        System.out.println("Value of a after swapping is: "+a);
//        System.out.println("Value of b after swapping is: "+b);
//    }
//}

// --------------------------------->TASK:3<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter three numbers: ");
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
//
//        int middle;
//
//        if ((a >= b && a <= c) || (a >= c && a <= b)) {
//            middle = a;
//        }
//
//        else if ((b >= a && b <= c) || (b >= c && b <= a)) {
//            middle = b;
//        }
//
//        else {
//            middle = c;
//        }
//
//        System.out.print("The middle number is: " + middle);
//    }
//}

// --------------------------------->TASK:5<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter any number: ");
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i);
//            }
//
//            System.out.println();
//        }
//    }
//}

// --------------------------------->TASK:6<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//    static void main() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number you want to reverse:");
//        int n = sc.nextInt();
//
//
//        if (n == 0) {
//            System.out.println(0);
//        }
//
//        while (n > 0) {
//            int digit = n % 10;
//            System.out.print(digit);
//            n = n / 10;
//        }
//    }
//}

// --------------------------------->TASK:7<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//
//        while (n >= 10) {
//
//            int sum = 0;
//
//            while (n > 0) {
//                sum = sum + (n % 10);
//                n = n / 10;
//            }
//
//            n = sum;
//            System.out.println(n);
//        }
//    }
//}

// --------------------------------->TASK:9<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//
//    static boolean isPrime(int n) {
//        if (n < 2) {
//            return false;
//        }
//
//        for (int i = 2; i * i <= n; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter any number:");
//        int n = sc.nextInt();
//
//
//        for (int i = 1; i <= 100; i++) {
//            if (isPrime(i)) {
//                System.out.print(i + " ");
//            }
//        }
//    }
//}

// --------------------------------->TASK:10<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a string: ");
//        String str = sc.nextLine();
//
//        int vowels = 0;
//        int consonants = 0;
//        int digits = 0;
//        int other = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//
//            char ch = str.charAt(i);
//
//            if (ch == 'a' || ch == 'e' || ch == 'i' ||
//                    ch == 'o' || ch == 'u' ||
//                    ch == 'A' || ch == 'E' || ch == 'I' ||
//                    ch == 'O' || ch == 'U') {
//
//                vowels++;
//            }
//            else if (ch >= 'a' && ch <= 'z' ||
//                    ch >= 'A' && ch <= 'Z') {
//
//                consonants++;
//            }
//            else if (ch >= '0' && ch <= '9') {
//                digits++;
//            }
//            else {
//                other++;
//            }
//        }
//
//        System.out.println("Vowels: " + vowels);
//        System.out.println("Consonants: " + consonants);
//        System.out.println("Digits: " + digits);
//        System.out.println("Other characters: " + other);
//    }
//}

// --------------------------------->TASK:11<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter any number: ");
//        int n = sc.nextInt();
//
//        int a = 0;
//        int b = 1;
//        int c;
//
//        for (int i = 1; i <= n; i++) {
//
//            System.out.print(a + " ");
//
//            c = a + b;
//            a = b;
//            b = c;
//        }
//    }
//}

// --------------------------------->TASK:12<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a string: ");
//        String str = sc.nextLine();
//
//        String clean = "";
//
//        for (int i = 0; i < str.length(); i++) {
//
//            char ch = str.charAt(i);
//
//            if (Character.isLetterOrDigit(ch)) {
//                clean = clean + Character.toLowerCase(ch);
//            }
//        }
//
//        boolean palindrome = true;
//
//        int left = 0;
//        int right = clean.length() - 1;
//
//        while (left < right) {
//
//            if (clean.charAt(left) != clean.charAt(right)) {
//                palindrome = false;
//                break;
//            }
//
//            left++;
//            right--;
//        }
//
//        if (palindrome) {
//            System.out.println("Palindrome");
//        } else {
//            System.out.println("Not a palindrome");
//        }
//    }
//}

// --------------------------------->TASK:14<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int[] numbers = new int[10];
//
//        System.out.println("Enter 10 numbers:");
//
//        for (int i = 0; i < 10; i++) {
//            numbers[i] = sc.nextInt();
//        }
//
//        int largest = numbers[0];
//        int secondLargest = Integer.MIN_VALUE;
//
//        for (int i = 1; i < 10; i++) {
//
//            if (numbers[i] > largest) {
//                secondLargest = largest;
//                largest = numbers[i];
//            }
//            else if (numbers[i] > secondLargest &&
//                    numbers[i] != largest) {
//                secondLargest = numbers[i];
//            }
//        }
//
//        if (secondLargest == Integer.MIN_VALUE) {
//            System.out.println("No second largest value.");
//        } else {
//            System.out.println("Second largest: " + secondLargest);
//        }
//    }
//}

// --------------------------------->TASK:15<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//
//    static void rotateLeft(int[] arr, int k) {
//
//        k = k % arr.length;
//
//        for (int count = 0; count < k; count++) {
//
//            int first = arr[0];
//
//            for (int i = 0; i < arr.length - 1; i++) {
//                arr[i] = arr[i + 1];
//            }
//
//            arr[arr.length - 1] = first;
//        }
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter array size: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        System.out.println("Enter elements:");
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.print("Enter k: ");
//        int k = sc.nextInt();
//
//        rotateLeft(arr, k);
//
//        System.out.println("After rotation:");
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}

// --------------------------------->TASK:16<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter an odd number: ");
//        int n = sc.nextInt();
//
//        if (n % 2 == 0) {
//            System.out.println("Please enter an odd number.");
//            return;
//        }
//
//        int middle = n / 2;
//
//        // Upper half
//        for (int i = 0; i <= middle; i++) {
//
//            for (int j = 0; j < middle - i; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 0; j < 2 * i + 1; j++) {
//
//                if (j == 0 || j == 2 * i) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//
//            System.out.println();
//        }
//
//        // Lower half
//        for (int i = middle - 1; i >= 0; i--) {
//
//            for (int j = 0; j < middle - i; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 0; j < 2 * i + 1; j++) {
//
//                if (j == 0 || j == 2 * i) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//
//            System.out.println();
//        }
//    }
//}

// --------------------------------->TASK:18<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter first string: ");
//        String first = sc.nextLine().toLowerCase();
//
//        System.out.print("Enter second string: ");
//        String second = sc.nextLine().toLowerCase();
//
//        if (first.length() != second.length()) {
//            System.out.println("Not anagrams");
//            return;
//        }
//
//        boolean anagram = true;
//
//        for (int i = 0; i < first.length(); i++) {
//
//            char ch = first.charAt(i);
//
//            int count1 = 0;
//            int count2 = 0;
//
//            for (int j = 0; j < first.length(); j++) {
//                if (first.charAt(j) == ch) {
//                    count1++;
//                }
//
//                if (second.charAt(j) == ch) {
//                    count2++;
//                }
//            }
//
//            if (count1 != count2) {
//                anagram = false;
//                break;
//            }
//        }
//
//        if (anagram) {
//            System.out.println("Anagrams");
//        } else {
//            System.out.println("Not anagrams");
//        }
//    }
//}

// --------------------------------->TASK:19<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter array size: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//        int[] result = new int[n];
//
//        System.out.println("Enter elements:");
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int size = 0;
//
//        for (int i = 0; i < n; i++) {
//
//            boolean found = false;
//
//            for (int j = 0; j < size; j++) {
//                if (arr[i] == result[j]) {
//                    found = true;
//                    break;
//                }
//            }
//
//            if (!found) {
//                result[size] = arr[i];
//                size++;
//            }
//        }
//
//        System.out.println("After removing duplicates:");
//
//        for (int i = 0; i < size; i++) {
//            System.out.print(result[i] + " ");
//        }
//    }
//}

// --------------------------------->TASK:21<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//
//    static int count = 0;
//
//    static long power(long x, int n) {
//
//        if (n == 0) {
//            return 1;
//        }
//
//        long half = power(x, n / 2);
//
//        count++;
//        long result = half * half;
//
//        if (n % 2 != 0) {
//            count++;
//            result = result * x;
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter x: ");
//        long x = sc.nextLong();
//
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//
//        long answer = power(x, n);
//
//        System.out.println("Answer: " + answer);
//        System.out.println("Multiplications: " + count);
//    }
//}

// --------------------------------->TASK:22<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int[][] matrix = new int[3][3];
//
//        System.out.println("Enter 9 numbers:");
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("Transpose:");
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(matrix[j][i] + " ");
//            }
//            System.out.println();
//        }
//
//        boolean symmetric = true;
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//
//                if (matrix[i][j] != matrix[j][i]) {
//                    symmetric = false;
//                }
//            }
//        }
//
//        if (symmetric) {
//            System.out.println("Matrix is symmetric.");
//        } else {
//            System.out.println("Matrix is not symmetric.");
//        }
//    }
//}

// --------------------------------->TASK:23<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//
//    static void binaryUsingRecursion(int n) {
//
//        if (n > 1) {
//            binaryUsingRecursion(n / 2);
//        }
//
//        System.out.print(n % 2);
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a decimal number: ");
//        int n = sc.nextInt();
//
//        // Using loop
//        int number = n;
//        String binary = "";
//
//        if (number == 0) {
//            binary = "0";
//        }
//
//        while (number > 0) {
//            int remainder = number % 2;
//            binary = remainder + binary;
//            number = number / 2;
//        }
//
//        System.out.println("Using loop: " + binary);
//
//        // Using recursion
//        System.out.print("Using recursion: ");
//
//        if (n == 0) {
//            System.out.print("0");
//        } else {
//            binaryUsingRecursion(n);
//        }
//    }
//}

// --------------------------------->TASK:25<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a string: ");
//        String str = sc.nextLine();
//
//        boolean found = false;
//
//        for (int i = 0; i < str.length(); i++) {
//
//            int count = 0;
//
//            for (int j = 0; j < str.length(); j++) {
//
//                if (str.charAt(i) == str.charAt(j)) {
//                    count++;
//                }
//            }
//
//            if (count == 1) {
//                System.out.println("First non-repeating character: "
//                        + str.charAt(i));
//                found = true;
//                break;
//            }
//        }
//
//        if (!found) {
//            System.out.println("none");
//        }
//    }
//}

// --------------------------------->TASK:26<---------------------------------

//public class Task1 {
//    public static void main(String[] args) {
//
//        System.out.println("Armstrong numbers:");
//
//        for (int number = 1; number <= 1000; number++) {
//
//            int temp = number;
//            int sum = 0;
//
//            while (temp > 0) {
//
//                int digit = temp % 10;
//                sum = sum + digit * digit * digit;
//
//                temp = temp / 10;
//            }
//
//            if (sum == number) {
//                System.out.print(number + " ");
//            }
//        }
//    }
//}

// --------------------------------->TASK:28<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//
//    static String compress(String str) {
//
//        String result = "";
//
//        int count = 1;
//
//        for (int i = 0; i < str.length(); i++) {
//
//            if (i < str.length() - 1 &&
//                    str.charAt(i) == str.charAt(i + 1)) {
//
//                count++;
//
//            } else {
//
//                result = result + str.charAt(i) + count;
//                count = 1;
//            }
//        }
//
//        return result;
//    }
//
//    static String decompress(String str) {
//
//        String result = "";
//
//        for (int i = 0; i < str.length(); i += 2) {
//
//            char ch = str.charAt(i);
//            int count = str.charAt(i + 1) - '0';
//
//            for (int j = 0; j < count; j++) {
//                result = result + ch;
//            }
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter string: ");
//        String str = input.nextLine();
//
//        String compressed = compress(str);
//
//        System.out.println("Compressed: " + compressed);
//        System.out.println("Decompressed: " + decompress(compressed));
//    }
//}

// --------------------------------->TASK:30<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter n: ");
//        int n = input.nextInt();
//
//        int[] arr = new int[n - 1];
//
//        System.out.println("Enter " + (n - 1) + " numbers:");
//
//        for (int i = 0; i < n - 1; i++) {
//            arr[i] = input.nextInt();
//        }
//
//        int expectedSum = n * (n + 1) / 2;
//
//        int actualSum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            actualSum = actualSum + arr[i];
//        }
//
//        int missing = expectedSum - actualSum;
//
//        System.out.println("Missing number: " + missing);
//    }
//}

// --------------------------------->TASK:31<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter number of rows: ");
//        int n = input.nextInt();
//
//        int[][] triangle = new int[n][];
//
//        for (int i = 0; i < n; i++) {
//
//            triangle[i] = new int[i + 1];
//
//            triangle[i][0] = 1;
//            triangle[i][i] = 1;
//
//            for (int j = 1; j < i; j++) {
//                triangle[i][j] =
//                        triangle[i - 1][j - 1] +
//                                triangle[i - 1][j];
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//
//            for (int j = 0; j < triangle[i].length; j++) {
//                System.out.print(triangle[i][j] + " ");
//            }
//
//            System.out.println();
//        }
//    }
//}

// --------------------------------->TASK:33<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//
//    static void permutations(String str, String answer) {
//
//        if (str.length() == 0) {
//            System.out.println(answer);
//            return;
//        }
//
//        for (int i = 0; i < str.length(); i++) {
//
//            char ch = str.charAt(i);
//
//            String left = str.substring(0, i);
//            String right = str.substring(i + 1);
//
//            String remaining = left + right;
//
//            permutations(remaining, answer + ch);
//        }
//    }
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a string: ");
//        String str = input.nextLine();
//
//        permutations(str, "");
//    }
//}

// --------------------------------->TASK:35<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//
//    static int binarySearch(int[] arr, int target) {
//
//        int left = 0;
//        int right = arr.length - 1;
//        int steps = 0;
//
//        while (left <= right) {
//
//            steps++;
//
//            int middle = (left + right) / 2;
//
//            if (arr[middle] == target) {
//                System.out.println("Steps: " + steps);
//                return middle;
//            }
//
//            if (arr[middle] < target) {
//                left = middle + 1;
//            } else {
//                right = middle - 1;
//            }
//        }
//
//        System.out.println("Steps: " + steps);
//        return -1;
//    }
//
//    static int firstOccurrence(int[] arr, int target) {
//
//        int left = 0;
//        int right = arr.length - 1;
//        int answer = -1;
//
//        while (left <= right) {
//
//            int middle = (left + right) / 2;
//
//            if (arr[middle] == target) {
//                answer = middle;
//                right = middle - 1;
//            }
//            else if (arr[middle] < target) {
//                left = middle + 1;
//            }
//            else {
//                right = middle - 1;
//            }
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter array size: ");
//        int n = input.nextInt();
//
//        int[] arr = new int[n];
//
//        System.out.println("Enter sorted array:");
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = input.nextInt();
//        }
//
//        System.out.print("Enter value to search: ");
//        int target = input.nextInt();
//
//        int position = binarySearch(arr, target);
//
//        System.out.println("Found at index: " + position);
//
//        int first = firstOccurrence(arr, target);
//
//        System.out.println("First occurrence: " + first);
//    }
//}

// --------------------------------->TASK:36<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a string: ");
//        String str = sc.nextLine();
//
//        String longest = "";
//
//        for (int i = 0; i < str.length(); i++) {
//
//            String current = "";
//
//            for (int j = i; j < str.length(); j++) {
//
//                char ch = str.charAt(j);
//
//                if (current.indexOf(ch) != -1) {
//                    break;
//                }
//
//                current = current + ch;
//            }
//
//            if (current.length() > longest.length()) {
//                longest = current;
//            }
//        }
//
//        System.out.println("Longest substring: " + longest);
//        System.out.println("Length: " + longest.length());
//    }
//}

// --------------------------------->TASK:38<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter rows: ");
//        int rows = sc.nextInt();
//
//        System.out.print("Enter columns: ");
//        int columns = sc.nextInt();
//
//        int[][] matrix = new int[rows][columns];
//
//        System.out.println("Enter matrix:");
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//
//        int top = 0;
//        int bottom = rows - 1;
//        int left = 0;
//        int right = columns - 1;
//
//        System.out.println("Spiral order:");
//
//        while (top <= bottom && left <= right) {
//
//            // Left to right
//            for (int i = left; i <= right; i++) {
//                System.out.print(matrix[top][i] + " ");
//            }
//            top++;
//
//            // Top to bottom
//            for (int i = top; i <= bottom; i++) {
//                System.out.print(matrix[i][right] + " ");
//            }
//            right--;
//
//            // Right to left
//            if (top <= bottom) {
//                for (int i = right; i >= left; i--) {
//                    System.out.print(matrix[bottom][i] + " ");
//                }
//                bottom--;
//            }
//
//            // Bottom to top
//            if (left <= right) {
//                for (int i = bottom; i >= top; i--) {
//                    System.out.print(matrix[i][left] + " ");
//                }
//                left++;
//            }
//        }
//    }
//}

// --------------------------------->TASK:40<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//
//    static int moves = 0;
//
//    static void hanoi(int n, char source, char helper, char destination) {
//
//        if (n == 1) {
//            System.out.println("Move disk from " + source + " to " + destination);
//            moves++;
//            return;
//        }
//
//        hanoi(n - 1, source, destination, helper);
//
//        System.out.println("Move disk from " + source + " to " + destination);
//        moves++;
//
//        hanoi(n - 1, helper, source, destination);
//    }
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter number of disks: ");
//        int n = input.nextInt();
//
//        hanoi(n, 'A', 'B', 'C');
//
//        int expected = (int)Math.pow(2, n) - 1;
//
//        System.out.println("Moves made: " + moves);
//        System.out.println("Expected moves: " + expected);
//    }
//}

// --------------------------------->TASK:42<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter size of first array: ");
//        int n = sc.nextInt();
//
//        int[] a = new int[n];
//
//        System.out.println("Enter first sorted array:");
//
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        System.out.print("Enter size of second array: ");
//        int m = sc.nextInt();
//
//        int[] b = new int[m];
//
//        System.out.println("Enter second sorted array:");
//
//        for (int i = 0; i < m; i++) {
//            b[i] = sc.nextInt();
//        }
//
//        int[] result = new int[n + m];
//
//        int i = 0;
//        int j = 0;
//        int k = 0;
//
//        while (i < n && j < m) {
//
//            if (a[i] < b[j]) {
//                result[k] = a[i];
//                i++;
//            } else {
//                result[k] = b[j];
//                j++;
//            }
//
//            k++;
//        }
//
//        while (i < n) {
//            result[k] = a[i];
//            i++;
//            k++;
//        }
//
//        while (j < m) {
//            result[k] = b[j];
//            j++;
//            k++;
//        }
//
//        System.out.println("Merged array:");
//
//        for (int x = 0; x < result.length; x++) {
//            System.out.print(result[x] + " ");
//        }
//    }
//}

// --------------------------------->TASK:44<---------------------------------

//public class Task1 {
//
//    static int n = 6;
//    static int[][] board = new int[n][n];
//
//    static int solutions = 0;
//
//    static boolean isSafe(int row, int col) {
//
//        // Check column
//        for (int i = 0; i < row; i++) {
//            if (board[i][col] == 1) {
//                return false;
//            }
//        }
//
//        // Check upper-left diagonal
//        int i = row - 1;
//        int j = col - 1;
//
//        while (i >= 0 && j >= 0) {
//
//            if (board[i][j] == 1) {
//                return false;
//            }
//
//            i--;
//            j--;
//        }
//
//        // Check upper-right diagonal
//        i = row - 1;
//        j = col + 1;
//
//        while (i >= 0 && j < n) {
//
//            if (board[i][j] == 1) {
//                return false;
//            }
//
//            i--;
//            j++;
//        }
//
//        return true;
//    }
//
//    static void solve(int row) {
//
//        if (row == n) {
//
//            solutions++;
//
//            if (solutions == 1) {
//                printBoard();
//            }
//
//            return;
//        }
//
//        for (int col = 0; col < n; col++) {
//
//            if (isSafe(row, col)) {
//
//                board[row][col] = 1;
//
//                solve(row + 1);
//
//                board[row][col] = 0;
//            }
//        }
//    }
//
//    static void printBoard() {
//
//        System.out.println("One solution:");
//
//        for (int i = 0; i < n; i++) {
//
//            for (int j = 0; j < n; j++) {
//
//                if (board[i][j] == 1) {
//                    System.out.print("Q ");
//                } else {
//                    System.out.print(". ");
//                }
//            }
//
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//
//        solve(0);
//
//        System.out.println("Total solutions: " + solutions);
//    }
//}

// --------------------------------->TASK:46<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter array size: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        System.out.println("Enter elements:");
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int currentSum = arr[0];
//        int maxSum = arr[0];
//
//        int start = 0;
//        int bestStart = 0;
//        int bestEnd = 0;
//
//        for (int i = 1; i < n; i++) {
//
//            if (arr[i] > currentSum + arr[i]) {
//                currentSum = arr[i];
//                start = i;
//            } else {
//                currentSum = currentSum + arr[i];
//            }
//
//            if (currentSum > maxSum) {
//                maxSum = currentSum;
//                bestStart = start;
//                bestEnd = i;
//            }
//        }
//
//        System.out.println("Maximum sum: " + maxSum);
//        System.out.println("Start index: " + bestStart);
//        System.out.println("End index: " + bestEnd);
//
//        System.out.print("Subarray: ");
//
//        for (int i = bestStart; i <= bestEnd; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}

// --------------------------------->TASK:48<---------------------------------

//import java.util.Scanner;
//
//public class Task1 {
//
//    static boolean checkRows(int[][] board) {
//
//        for (int i = 0; i < 9; i++) {
//
//            boolean[] found = new boolean[10];
//
//            for (int j = 0; j < 9; j++) {
//
//                int number = board[i][j];
//
//                if (number < 1 || number > 9 || found[number]) {
//                    return false;
//                }
//
//                found[number] = true;
//            }
//        }
//
//        return true;
//    }
//
//    static boolean checkColumns(int[][] board) {
//
//        for (int j = 0; j < 9; j++) {
//
//            boolean[] found = new boolean[10];
//
//            for (int i = 0; i < 9; i++) {
//
//                int number = board[i][j];
//
//                if (number < 1 || number > 9 || found[number]) {
//                    return false;
//                }
//
//                found[number] = true;
//            }
//        }
//
//        return true;
//    }
//
//    static boolean checkBoxes(int[][] board) {
//
//        for (int row = 0; row < 9; row += 3) {
//
//            for (int col = 0; col < 9; col += 3) {
//
//                boolean[] found = new boolean[10];
//
//                for (int i = row; i < row + 3; i++) {
//
//                    for (int j = col; j < col + 3; j++) {
//
//                        int number = board[i][j];
//
//                        if (number < 1 ||
//                                number > 9 ||
//                                found[number]) {
//
//                            return false;
//                        }
//
//                        found[number] = true;
//                    }
//                }
//            }
//        }
//
//        return true;
//    }
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        int[][] board = new int[9][9];
//
//        System.out.println("Enter Sudoku:");
//
//        for (int i = 0; i < 9; i++) {
//
//            for (int j = 0; j < 9; j++) {
//                board[i][j] = input.nextInt();
//            }
//        }
//
//        boolean valid =
//                checkRows(board) &&
//                        checkColumns(board) &&
//                        checkBoxes(board);
//
//        if (valid) {
//            System.out.println("Valid Sudoku");
//        } else {
//            System.out.println("Invalid Sudoku");
//        }
//    }
//}

// --------------------------------->TASK:50<---------------------------------

//public class Task1 {
//    public static void main(String[] args) {
//
//        int[] digits = new int[1000];
//
//        digits[0] = 1;
//
//        int size = 1;
//
//        for (int number = 2; number <= 50; number++) {
//
//            int carry = 0;
//
//            for (int i = 0; i < size; i++) {
//
//                int value = digits[i] * number + carry;
//
//                digits[i] = value % 10;
//
//                carry = value / 10;
//            }
//
//            while (carry > 0) {
//
//                digits[size] = carry % 10;
//
//                carry = carry / 10;
//
//                size++;
//            }
//        }
//
//        System.out.println("50! = ");
//
//        for (int i = size - 1; i >= 0; i--) {
//            System.out.print(digits[i]);
//        }
//    }
//}