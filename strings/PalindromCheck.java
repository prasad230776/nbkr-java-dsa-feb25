import java.util.Scanner;

public class PalindromCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st1 = sc.next();
        int len = st1.length();
        boolean palindrom = true;
        for(int index = 0; index < len /2 ; index ++){
            if(st1.charAt(index) != st1.charAt(len-1 - index)){
                palindrom = false;
                break;
            }
        }
        System.out.println(palindrom);
    }
}
