package Week8;

// AGGREGATION
//class Book{
//    String name;
//    public Book(String name) {
//        this.name = name;
//    }
//
//    void ab(){
//        System.out.println("Library of Allama Iqbal");
//    }
//}
//
//class Library{
//    String name;
//    Book b;
//
//    public Library(Book b) {
//        this.b = b;
//    }
//
//    void display(){
//        System.out.println(b.name);
//    }
//
//    void st(){
//        System.out.println("My id is: 42");
//    }
//}
//
//public class Task1 {
//    static void main() {
//        Book b1 = new Book( "Jawab e Shikwa");
//        Library l = new Library(b1);
//        b1.ab();
//        l.display();
//        l.st();
//    }
//}

// --------------------------------------------------------------------

//class Teacher{
//    String name;
//
//    public Teacher(String name) {
//        this.name = name;
//    }
//    void display(){
//        System.out.println("Teacher name is:"+name);
//    }
//}
//
//
//class Department{
//    String name;
//    Teacher alias;
//
//    public Department(Teacher alias) {
//        this.alias = alias;
//    }
//    void display1(){
//        System.out.println("Computer Engineering");
//    }
//}
//
//
//public class Task1 {
//    static void main(String[] args) {
//        Teacher t = new Teacher("Nadeem");
//        Department d = new Department(t);
//
//        t.display();
//        d.display1();
//
//    }
//}

// --------------------------------------------------------------------

//class Room{
//    String name;
//    public Room(String name) {
//        this.name = name;
//    }
//
//    void display1(){
//        System.out.println("Latif");
//    }
//}
//
//class House{
//    Room m = new Room("Alis room");
//
//    void display(){
//        System.out.println(m.name);
//    }
//}
//
//public class Task1 {
//    static void main(String[] args) {
//        House h = new House();
//        h.display();
//
//    }
//}

// -----------------------------------------------------------------------

//import java.io.File;
//import java.io.IOException;
//
//public class Task1 {
//    static void main(String[] args) throws IOException {
//        File myfile = new File("Orewa.txt");
//        myfile.createNewFile();
//    }
//}

// ---------------------------------------------------------------------

//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class Task1 {
//    static void main(String[] args) throws IOException {
//        FileWriter myfile = new FileWriter("Orewa.txt");
//        myfile.write("Purbash dost");
//        myfile.close();
//    }
//}

// ----------------------------------------------------------------------

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {
    static void main(String[] args) throws IOException {
        FileWriter myfile = new FileWriter("Orewa.txt");
        myfile.write("Sigma Boys");
        myfile.close();
    }
}