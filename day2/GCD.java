import java.util.Scanner;

public class GCD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two nums: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int numerator = num1;
        int denominator = num2;
        int mod = numerator % denominator;
        while(mod != 0){
            numerator = denominator;
            denominator = mod;
            mod = numerator % denominator;
        }
        System.out.printf("GCD of %d and %d is %d", num1, num2, denominator);
    }
}