import java.util.Scanner;

public class GradeWithSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        int sd = marks / 10;
        // switch (sd) {
        //     case 8,9:
        //         System.out.println("A");
        //         break;
        //     case 7 :
        //     System.out.println("B");
        //     break;
            
        // }

        String result = switch (sd) {
            case 8,9 -> "A";
            case 7 -> "B";
            default ->"invalid";
        };
        System.out.println(result);
    }
}
