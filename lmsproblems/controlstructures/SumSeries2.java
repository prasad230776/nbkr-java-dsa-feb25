/*
 * 1-x^2+x^2-x^2+ ... n terms
 */
import java.util.Scanner;

public class SumSeries2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int sum = 1;
        int term = x;
        int sign = -1;
        for(int i = 1 ; i < n; i++){
            sum = sum + term * sign;
            sign = -sign;
            term = term * x;
        }
        System.out.println(sum);
    }
}
