import java.util.Scanner;

public class BiggerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.printf("%d is bigger", num1);
        }else{
            System.out.printf("%d is bigger", num2);
        }
        /* using simple if
        int big = num1;
        if(num2 > big){
            big = num2;
        }
        System.out.printf("%d is bigger", big);
        */
    }
}
