public class StaticBlock {
    static{
        System.out.println("hi from static black before main");
    }
    public static void main(String[] args) {
        System.out.println("from main");
    }
}
