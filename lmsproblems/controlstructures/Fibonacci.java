import java.util.Scanner;

public class Fibonacci {
    static int findFibonacci(int n){
        if(n == 1) return 0;
        if(n == 2) return 1;
        return findFibonacci(n-1) + findFibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = findFibonacci(n);
        System.out.println(result);
    }
}
