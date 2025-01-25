class fang{
    void namk1(){
        System.out.println(" Its a grand father class");
    }
}

class fang1 extends fang{
    void namk2(){
        System.out.println("Its a parent class ");
    }
}

class fang2 extends fang{
    void namk3(){
        System.out.println("Its a parent class");
    }
}

class fang3 extends  fang{
    void namk4(){
        System.out.println(" ITs a child class ");

    }
}



public class Hiraichical {

    public static void main(String[] args) {
        //    Inheritance is out main class
//    the concept of inheritance include like Multiple and Multilecel inheritance and Herirarchivcal inheritance
//    Multilevel Inheritance - The derived class acces all the properties and methodd of immediate parent class
//    Multiple Inheritance - Class A + Class B → Class C (derived from A and B)
//    Hierarchical Inheritance -Class A (base class)
//                              Class B (inherits from A)
//                                Class C (inherits from A)
//                                   Class D (inherits from A)
//         java solves it using the Interface
        fang3 ty = new fang3();
        ty.namk1();
        fang2 hu = new fang2();
        hu.namk3();

    }
}
