public class Test {
    public static void main(String[] args) {
        new C();
    }
}

class A{
    A(){
        System.out.println("from calss A");
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