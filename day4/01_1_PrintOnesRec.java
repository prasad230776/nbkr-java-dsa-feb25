import java.util.Scanner;

class PrintOnesRec {
    static void printOne(int n){
        if(n <= 0) return;
        System.out.print(1);
        printOne(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printOne(n);
    }
    
}
