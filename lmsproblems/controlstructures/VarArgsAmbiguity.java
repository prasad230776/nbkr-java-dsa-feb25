 class VarargsAmbiguity {
    public static void test(int... numbers) {
        System.out.println("Int Varargs");
    }
    public static void test(Integer... numbers) {
        System.out.println("Integer Varargs");
    }

    public static void test(Double... numbers) {
        System.out.println("Double Varargs");
    }


    public static void main(String[] args) {
        test(10, 20);  
    }
}