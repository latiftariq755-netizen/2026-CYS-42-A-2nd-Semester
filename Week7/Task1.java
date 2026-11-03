package Week7;

// ------------------------------- Task 1 ----------------------------------------

//class Student{
//    String name;
//    int rollno;
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", rollno=" + rollno +
//                '}';
//    }
//
//    public void info() {
//        System.out.println(this.name);
//        System.out.println(this.rollno);
//    }
//
//    Student(String name, int rollno){
//        this.name = name;
//        this.rollno = rollno;
//    }
//}
//
//public class Task1 {
//    static void main() {
//        Student sc = new Student("Latif", 42);
//        sc.info();
//    }
//
//}

// --------------------------- Task 2 --------------------------

//class Student {
//
//    String name ;
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                '}';
//    }
//}
//
//class Teacher {
//    Student s;
//    void display (){
//        System.out.println(s);
//
//    }
//}
//
//
//class Test {
//    public  static void main(String[]args) {
//        Student w = new Student();
//        Teacher t = new Teacher();
//        t.s=w;
//        t.display();
//
//    }
//}

// ------------------------------- Task 3 ------------------------------------

class Car {
    String company ;
    String company1 ;
    String company2 ;
    String company3 ;

    @Override
    public String toString() {
        return "Car{" +
                "comapny='" + company + '\'' +
                ", company1='" + company1 + '\'' +
                ", company2='" + company2 + '\'' +
                ", company3='" + company3 + '\'' +
                '}';
    }
}


class Brand {
    Car c;
    void display(){
        System.out.println(c);
    }

    public static void main(String[]args) {
        Brand b = new Brand();
        Car k = new Car();
        b.c=k;
        k.company = "Honda Civic(RS Turbo)";
        k.company1 = "Toyota MarkX";
        k.company2 = "Corolla Grande";
        k.company3 = "BIAC";

        b.display();

    }
}