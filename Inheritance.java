class POL{
    void disp(){
//        Initialize the method
        System.out.println("Hellow my name is Dnyanesh");
    }
}

class sol extends POL{
    void disp1(){
        int a = 6;
        int b = 8;
        int c = a +b;
        System.out.println(c);
    }
}
class yot extends sol{
    void disp2(){
        System.out.println("It is a multilevel Inheritance");
    }
}













public class Inheritance {
//    Inheritance is out main class
//    the concept of inheritance include like Multiple and Multilecel inheritance and Herirarchivcal inheritance
//    Multilevel Inheritance - The derived class acces all the properties and methodd of immediate parent class
//    Multiple Inheritance - Class A + Class B → Class C (derived from A and B)
//    Heraichical Inheritance -Class A (base class)
//                              Class B (inherits from A)
//                                Class C (inherits from A)
//                                   Class D (inherits from A)
public static void main(String[] args) {
//     make object of last class
    yot gh = new yot();
    gh.disp();
    gh.disp1();
    gh.disp2();

}

}
