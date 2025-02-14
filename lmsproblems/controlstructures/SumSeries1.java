/*
 * 1-2^2+3^2-4^2+ ... n terms
 */
import java.util.Scanner;

public class SumSeries1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int term = 1;
        int sign = 1;
        for(int i = 1 ; i <= n; i++){
            sum = sum + term * term * sign;
            sign = -sign;
            term = term + 1;
        }
        System.out.println(sum);
    }
}
