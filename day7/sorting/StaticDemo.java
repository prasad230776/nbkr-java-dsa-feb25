public class StaticDemo {
    static int a; 
    int b;
    static void m1(){
        System.out.println(a);
       // System.out.println(b);
    }

    void m2(){
        System.out.println(b);
        System.out.println(a);
        System.out.println(StaticDemo.a);
    }
}
