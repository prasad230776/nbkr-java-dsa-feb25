import java.util.ArrayList;
import java.util.Scanner;

public class EvenCountVals {
    static int findDigitsCount(int val){
        int count = 0;
        while(val >0){
            count++;
            val /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i< n; i++){
            arr.add(sc.nextInt());
        }
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int  x : arr) {
            int count = findDigitsCount(x);
            if(count % 2==0){
                newArray.add(x);
            }
        }
        for(int x: newArray){
            System.out.println(x);
        }

    }
    
}
