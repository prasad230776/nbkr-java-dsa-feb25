import java.util.Scanner;

class BinarySearch{
    static int findElement(int[] arr, int value){

        int low = 0;
        int high = arr.length - 1;
        int mid;
        while(low <= high){
            mid = (low + high) / 2;
            if(arr[mid] == value){
                return mid;
            }
            if(arr[mid] > value){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] data = {2,4,6,8,9};
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int pos = findElement(data, val);
        if(pos != -1){
            System.out.printf("Found at %d", pos);
        }else{
            System.out.println("not found");
        }
    }
}
