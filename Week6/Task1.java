package Week6;

//class Student{
//    String name;
//
//    public Student(String name) {
//        this.name = name;
//    }
//}
//
//class teacher{
//
//    void student(Student s1){
//        System.out.println(s1.name);
//    }
//}
//
//public class Task1 {
//    static void main() {
//
//        Student s = new Student("Latif"); // OBJECT
//        teacher t = new teacher();
//
//        t.student(s);
//    }
//}


class Engine{
     void start() {
        System.out.println("Engine is start....");
    }
}

class car{
    private Engine s1;
    public car(){
    }

     public void drive() {
        s1.start();
         System.out.println("Car is driving....");
     }

}

public class Task1 {
    static void main() {
        car d =new car();
        Engine a = new Engine();

        a.start();
    }
}