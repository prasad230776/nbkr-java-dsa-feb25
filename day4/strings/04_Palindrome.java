import java.util.Scanner;

class Palindrome {
    static boolean isPalindrome(String s){
        boolean flag = true;
        int len = s.length();
        for(int i = 0; i < len/2; i++){
            if(s.charAt(i) != s.charAt(len-1-i)){
                flag = false;
                break;
            }
        }

        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        boolean flag = isPalindrome(s1);
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
