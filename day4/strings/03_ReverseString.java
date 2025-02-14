import java.util.Scanner;

class ReverseString {

    // using string concatination
    static String reverse1(String s){
        String rs = "";
        for(int i = s.length() - 1; i >= 0; i--){
            rs += s.charAt(i);
        }
        return rs;
    }

    //using string builder
    static String reverse2(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    //using char array and swapping
    static String reverse3(String s){
        char[] ar = s.toCharArray();
        int len = ar.length;
        for(int i = 0; i < len / 2; i++){
            char t = ar[i];
            ar[i] = ar[len-1-i];
            ar[len-1-i] = t;
        }
        String rs = String.valueOf(ar);
        return rs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rs ="";
        rs = reverse1(s);
        System.out.println(rs);

        rs = reverse2(s);
        System.out.println(rs);

        rs = reverse3(s);
        System.out.println(rs);
    }


}
