import java.util.Scanner;

public class DecreasingTriangle {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            //decreasing spaces 4 to 0 
            for(int j = i+1 ; j <= n; j++ ){
                System.out.print("  ");
            }
            //increasing *
            for(int j = 1 ; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
