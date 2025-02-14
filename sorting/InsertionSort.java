import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] data){
        for(int i = 1 ; i < data.length; i++){
            int j = i;
            int key = data[j];
            while(j > 0 && data[j] < data[j-1]){
                data[j] = data[j-1];
                j --;
            }
            data[j] = key;

        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] data = new int[size];
        for(int i = 0; i < size; i++){
            data[i] = sc.nextInt();
        }
        insertionSort(data);
        for( int x : data){
            System.out.print(x+ " ");
        }
        System.out.println();

    }
}
