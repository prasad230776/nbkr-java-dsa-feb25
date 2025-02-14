import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int rn = 0;
            int n = sc.nextInt();
            for( ; n > 0; n = n/10){
                rn = rn * 10 +  n % 10;
            }
            System.out.println(rn);
            
    }
}
