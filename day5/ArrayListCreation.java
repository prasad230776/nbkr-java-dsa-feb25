import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCreation {

    static int findMin(ArrayList<Integer> marks){
        int min = Integer.MAX_VALUE;
        for(int x : marks){
            if(x < min){
                min = x;
            }
        }
        return min;
    }

    static ArrayList<Double> newMarks(ArrayList<Integer> marks){

        ArrayList<Double> newMarks = new ArrayList<Double>();
        for(int x : marks){
            newMarks.add(x*1.15);
        }
        return newMarks;

    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> marks = new ArrayList<>();
    for(int i = 0; i < n; i++){
        //int m = sc.nextInt();
        marks.add(sc.nextInt());
    }
    for(int x: marks){
        System.out.println(x);
    }
   } 
}
