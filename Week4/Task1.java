package Week4;

import java.util.Scanner;

//class Student{
//    private String name;
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getRollno() {
//        return rollno;
//    }
//
//    public void setRollno(int rollno) {
//        this.rollno = rollno;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    private int rollno;
//    private int age;
//}
//
//public class Task1 {
//    static void main() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Latif");
//        String a = sc.nextInt();
//         Student st = new Student();
//
//
//    }
//}



//class info {
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    private int age;
//
//    public info(int age) {
//        this.age = age;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public info(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//
//}
//
//public class Task1 {
//    static void main() {
//        info n = new info("Latif",19);
//        System.out.println(n.getName());
//        System.out.println(n.getAge());
//    }
//}
//


class Book{
     String name;
     int marks;

    Book(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
    void display(){
        System.out.println(name + ":" + marks + "marks");
    }

}

public class Task1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books:");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i<=n; i++) {
            System.out.print("Enter subject name:");
            String name = sc.nextLine();
            System.out.print("Enter Marks:");
            int marks=sc.nextInt();
            sc.nextLine();
            Book s = new Book(name, marks);
            s.display();
        }
        sc.close();
    }
}