import java.util.Scanner;

public class HalllowDiamond {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        for(int i = 1; i < n ; i++){
            //decreasing space
            for(int j = i; j<n; j++){
                System.out.print("  ");
            }
            //increasing hallow
            for(int j = 1; j<i; j++){
                if(j==1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            //increasing hallow
            for(int j = 1; j<=i; j++){
                if(j==i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i = 1; i <= n ; i++){   
            //increasing space
            for(int j = 1; j<i; j++){
                System.out.print("  ");
            } 
            //decreasing hallow
            for(int j = i; j<n; j++){
                if(j==i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            //decreasing hallow
            for(int j = i; j<=n; j++){
                if(j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
