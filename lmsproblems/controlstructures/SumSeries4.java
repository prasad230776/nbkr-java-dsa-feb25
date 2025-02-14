/*
 * 1 - x + x^2/2! - x^3/3! +  + ... n terms
 */
import java.util.Scanner;

public class SumSeries4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 1;
        double x = sc.nextDouble();
        int n = sc.nextInt();
        double nr = x;
        double dr = 1;
        int count = 1;
        int sign = -1;
        for(int i = 1; i< n; i++){
            sum = sum + nr / dr * sign;
            sign = -sign;
            nr = nr * x;
            count ++;
            dr = dr* count;
        }
        System.out.printf("%.2f",sum);
    }
}
