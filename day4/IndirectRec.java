class IndirectRecursionExample {
    public static void main(String[] args) {
        functionA(5);
    }

    static void functionA(int n) {
        if (n > 0) {
            System.out.println("A: " + n);
            functionB(n - 1);
        }
    }

    static void functionB(int n) {
        if (n > 1) {
            System.out.println("B: " + n);
            functionA(n / 2);
        }
    }
}