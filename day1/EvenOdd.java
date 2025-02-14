import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if(num % 2 == 0 ){
            System.out.printf("The given number %d is even\n", num);
        }else{
            System.out.printf("The given number %d is odd\n", num);

        }
    }
}
