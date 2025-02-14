public class ClassPrg1Kadani {
    
    public static void main(String[] args) {
        int[] data = {1,2,3,-10, 5};
        int maxSum = 0;
        int sum = 0;
        for(int i = 0; i< data.length; i++){
            sum += data[i];
            if(sum < 0){
                sum = 0;
            }
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }

}
