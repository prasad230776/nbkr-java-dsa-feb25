import java.util.Scanner;

class SwitchStmt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wed");
            break;
            default:
            System.out.println("Not a valid");
        }
    }
}

/*
 * i/p: 1
 * o/P Monday
 */