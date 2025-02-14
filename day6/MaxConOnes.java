public class MaxConOnes {
    public static void main(String[] args) {
        int[] data = {1,1,2,1,1,3,1,1,1,1};
        int maxConOnes = Integer.MIN_VALUE;
        int curCount = 0;
        for(int i = 0; i< data.length - 1; i++){
            if(data[i] == 1 && data[i+1] == 1){
                curCount += (curCount == 0 )? 2 : 1;
            }else{
                curCount = 0;
            }
            maxConOnes = Integer.max(maxConOnes, curCount);
        }
        System.out.println(maxConOnes);
    }
}
