import java.util.Scanner;

class CompareStrings {
    static boolean isEqual(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        boolean flag = true;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        boolean equal = isEqual(s1, s2);
        
        if(equal){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
