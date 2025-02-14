import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        boolean leap = false;
        if(year % 100 == 0){
            if(year % 400 == 0){
                leap = true;
            }
        }else if(year % 4 == 0){
            leap = true;
        }
        if(leap){
            System.out.printf("%d year is leap year", year);
        }else{
            System.out.printf("%d year is not a leap yaer", year);

        }
    }
}
