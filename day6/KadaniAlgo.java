public class KadaniAlgo {
    public static void main(String[] args) {
        int[] data = {2,3,-1, 6,9,-7};
        int maxSum = Integer.MIN_VALUE;
        int stPos = 0;
        int endPos = 0;
        int presentSum = 0;
        for(int i = 0; i < data.length; i++){
            if(presentSum + data[i] > 0){
                presentSum = presentSum + data[i];
            }else{
                presentSum = 0;
                stPos = i + 1;
            }
            if(presentSum > maxSum){
                maxSum = presentSum;
                endPos = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(stPos);
        System.out.println(endPos);
    }
}
