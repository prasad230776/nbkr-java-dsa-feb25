import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String op = sc.next();
        int result = switch(op){
            case "+" -> num1 + num2;
            default -> Integer.MIN_VALUE;
        };
        System.out.println(result);
    }
}
