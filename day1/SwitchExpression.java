import java.util.Scanner;

public class SwitchExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks ( 0 to 99):");
        int marks = sc.nextInt();
        int param = marks/10;
        char grade = switch (param) {
            default -> 'F';
            case 8,9 ->  'A';
            case 7 -> 'B';
            case 6 ->  'C';
            case 5  -> {
                yield 'D'; // for a block of code with multiple stmts.
            } 
        };
        System.out.printf("Grade for the marks %d is %c", marks, grade);
    }
}
