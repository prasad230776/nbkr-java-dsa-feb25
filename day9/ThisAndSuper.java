public class ThisAndSuper {
    
}

class A{
    int a;
    A(){
        this(10); // calling the same class constructor
        System.out.println(" from A's default constructor");
       // this(10); wrong place
    }
    A(int a){
        System.out.println("from A's params constructor");
    }
    void a(){ // variables and method names can be same in the same class
        System.out.println("from a's method");
        System.out.println(this.a); // accessing current instance variable

    }
    void m1(){ // variables and method names can be same in the same class
        System.out.println("from a's method");
        this.a(); // calling a() method
    }
}

class B extends A{
    int b;
    B(){
        super(); //calling parent constructor, valid-if this is firt statement
        //this(10); // calling other constructor of the same class and is valid if this is first statement
        System.out.println(" from B's default constructor");
       //  this(10); wrong place 
       //super();  wrong place
    }
    B(int b){
        System.out.println("from B's params constructor");
        this.b = b;
    }
    void b(){ // variables and method names can be same in the same class
        System.out.println("from B's method");
        super.a(); // can use super any where to access the parents methods and variables
    }
}