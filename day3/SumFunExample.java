import java.util.Scanner;

public class SumFunExample {
    public static int  sum(int n1, int n2){
        int result = n1 + n2;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int s = sum(n1, n2);
        System.out.println(s);
    }
}
