public class TestKadani {
    public static void main(String[] args) {
        int[] data = {2,3,-1, 6,9,-7};
        int sum ;
        int maxSum = Integer.MIN_VALUE;
        int size = data.length;
        for(int i = 0; i< size; i++){
            sum = 0;
            for(int j = i; j< size; j++){
                sum = sum + data[j];
                if(sum < 0){
                    sum = 0;
                }
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
