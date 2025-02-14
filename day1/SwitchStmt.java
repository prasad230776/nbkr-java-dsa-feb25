import java.util.Scanner;

public class SwitchStmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks ( 0 to 99):");
        int marks = sc.nextInt();
        int param = marks/10;
        char grade ='\0';
        switch (param) {
            case 8,9:
                grade = 'A';
                break;
            case 7:
                grade = 'B';
                break;
            case 6:
                grade = 'C';
                break;
            case 5:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.printf("Grade for the marks %d is %c", marks, grade);
    }
}
