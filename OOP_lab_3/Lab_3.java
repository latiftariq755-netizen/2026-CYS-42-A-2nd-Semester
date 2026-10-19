package OOP_lab_3;

//class Hello{
//    void h(){
//        System.out.println("hello world");
//    }
//}
//
//public class Lab_3 {
//    static void main() {
//        Hello a = new Hello();
//        a.h();
//    }
//}

// ------------------------>CORRECT<---------------------

//class name{
//    void n(){
//        System.out.println("Latif Tariq");
//        System.out.println(42);
//        System.out.println("Lahore");
//    }
//}
//
//public class Lab_3 {
//    static void main() {
//        name a = new name();
//        a.n();
//    }
//}

// ------------------------>CORRECT<--------------

//class Adnan{
//    private void a(){
//        System.out.println("Adnan");
//    }
//}
//
//class Ali{
//    private void A(){
//        System.out.println("Ali");
//    }
//}
//
//class Najam{
//    private void n(){
//        System.out.println("NAJAM");
//    }
//}
////
////
//public class Lab_3 {
//    static void main() {
//        Adnan s = new Adnan();
//        Ali d = new Ali();
//        Najam h = new Najam();
//
//        s.a();
//        d.A();
//        h.n();
//    }
//}


class encapsulation{
    String name ;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    private String cnic;
}

public class Lab_3 {
    static void main() {
        encapsulation a = new encapsulation();
        a.name = "Latif";
        a.setAge(19);
        a.setCnic("35201967462");
        System.out.println(a.name);
        System.out.println(a.getAge());
        System.out.println(a.getCnic());
    }
}