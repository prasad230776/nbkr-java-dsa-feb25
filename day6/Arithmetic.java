public class Arithmetic {
    boolean isArithmeticSequence (int[] arr) {
		
        return true;
	}
    static int findMin(int[] data){
        int min = Integer.MAX_VALUE;
        for(int x : data){
            if(x < min){
                min = x;
            }
        }
        return min;
    }
    static int findMax(int[] data){
        int max = Integer.MIN_VALUE;
        for(int x : data){
            if(x > max){
                max = x;
            }
        }
        return max;
    }
    static boolean isPresent(int[] data, int val){
        for(int x: data){
            if(val == x){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //int data[] = {9, 13, 5, 15, 7, 11};
        // int data[] = {4, 1, 2};
        int data[] = {1,1,1};
        int minValue = findMin(data);
        int maxValue = findMax(data);
        int rem =(maxValue - minValue) % (data.length-1);
        if(rem != 0){
            System.out.println("Not possible");
            System.exit(0);
        }
        int d = (maxValue - minValue) / (data.length-1);
        int el = minValue;
        for(int i = 1; i < data.length-1; i++){
            el += d;
            if(!isPresent(data, el)){
                System.out.println("Not possible");
                System.exit(0);
            }
        }
        System.out.println("possible");
    }
}
