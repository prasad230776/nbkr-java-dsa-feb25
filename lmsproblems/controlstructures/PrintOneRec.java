public class PrintOneRec {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        if(n==0) return;
        System.out.print("1 ");
        print(n-1);
    }
}
