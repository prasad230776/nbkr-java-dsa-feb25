import java.util.Scanner;

class Cumulative2 {
    static void display(int[] arr){
        for(int x: arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    static int[] cumSum(int[] arr){
        int[] newArr = new int[arr.length];
        newArr[0] = arr[0];
        for(int i =1; i<arr.length; i++){
            newArr[i] = arr[i] + newArr[i-1];
        }
        return newArr;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[][] answer= new int[n][];
       for(int count = 0; count < n ; count++){
        int size = sc.nextInt();
        int data[] = new int[size];
        for(int j = 0; j <size; j++){
            data[j] = sc.nextInt();

        }
        answer[count] =  cumSum(data);
       }
       for(int[] arr : answer){
        display(arr);
       }
    }
}
