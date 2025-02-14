import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks:");
        int marks = sc.nextInt();
        char grade;
        if(marks >= 80){
            grade = 'A';
        }else if(marks >=70){
            grade = 'B';
        }else if(marks >=60){
            grade = 'C';
        }else if(marks >= 50){
            grade = 'D';
        }else{
            grade = 'F';
        }

        System.out.printf("Grade of the marks %d is %c\n", marks, grade);
    }
}
