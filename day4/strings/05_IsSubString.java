import java.util.Scanner;

class IsSubString {
    static boolean isSubString(String s1, String s2){
        boolean flag = false;

        int l1 = s1.length();
        int l2 = s2.length();
        if(l1 < l2) {
            return false;
        }
        for(int i = 0; i< l1-l2 + 1 ; i++){
            int j=0;
            while(j<l2){
                if(s1.charAt(i+j) != s2.charAt(j)){
                    break;
                }
                j++;
            }
            if(j == l2){
                flag = true;
                break;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        boolean flag = isSubString(s1, s2);
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
