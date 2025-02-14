import java.util.Scanner;

class TwoConsecutiveZeros {
 
    static boolean isPresent(String s){
        boolean flag = false;
        for(int i= 0; i < s.length()-1; i++){
            if(s.charAt(i) == '0' && s.charAt(i+1) == '0'){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean flag = isPresent(s);
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
