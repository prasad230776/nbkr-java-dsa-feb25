import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        int diff = 100 - age;
        int result = 2024 + diff;
        System.out.printf("I will be 100 years onld in %d", result);
    }
}

