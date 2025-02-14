public class Hai {
    static String s1 = "Hello";
    void m1(){
        String s2 = "Hello";
        System.out.println(s1==s2);
    }
    public static void main(String[] args) {
        // System.out.println("Hai");
        // int __ = 100;
        // System.out.println(__);
        // for(int i = 0; i <10; i++){
        //     int count = i + 1;
        //     System.out.println(i);
        // }
        String s2 = "Hello";
        System.out.println(s1==s2);
        Hai ob = new Hai();
        ob.m1();

    }
}
