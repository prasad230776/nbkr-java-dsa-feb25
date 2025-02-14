public class GCD {
    static int gcd(int n1, int n2){
        int nr = n1;
        int dr = n2;
        int r;
        while((r = nr % dr)!=0){
            nr = dr;
            dr = r;
        }
        return dr;
    }
}
