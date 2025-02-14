/*
 * 1 + 2! + 3! + 4! + ... n terms
 */
import java.util.Scanner;

public class SumSeries3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int term = 1;
        int count = 1;
        for(int i = 1 ; i <= n; i++){
            sum = sum + term ;
            count += 1;
            term *= count;
        }
        System.out.println(sum);
    }
}
