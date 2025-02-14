import java.util.Scanner;

class GCDFunction {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // int gcd = findGCDR(num1, num2);
        int gcd = findGCDNormal(num1, num2);
        System.out.println(gcd);
                
    }
        
    private static int findGCDR(int num1, int num2) {
        int rem = num1 % num2;
        if(rem == 0 ){
            return num2;
        }
        return findGCDR(num2, rem);
    }

    static int findGCDNormal(int num1, int num2){
        int n = num1;
        int d = num2;
        /*
         * using while
         */
        // int r ;
        // while(( r = n % d) != 0){
        //     n = d;
        //     d = r;
        // }

        /*
         * using for
         */
        for(int r = n % d; r != 0 ; r = n % d){
            n = d;
            d = r;
        }

        return d;
        
    }
}
