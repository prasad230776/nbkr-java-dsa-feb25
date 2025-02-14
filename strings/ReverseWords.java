import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st1 = sc.nextLine();
        String[] words = st1.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int index = words.length - 1; index >=0; index--){
            sb.append(words[index]);
            sb.append(" ");
        }
        String result = sb.toString().trim();
        System.out.println(result);
    }
}
