public class MultiLevel {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A{
    A(){
        System.out.println("From class A");
    }
}
class B extends A{
    B(){
        System.out.println("From class B");
    }
}
class C extends B{
    C(){
        System.out.println("From class C");
    }
}
