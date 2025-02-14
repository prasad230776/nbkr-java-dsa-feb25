public class Twins {
    public static void main(String[] args) {
        int[] data = {3,4,3,5,5,1,2,1};
        int count =0;
        for(int i = 0; i < data.length - 1; i++){
            for(int j = i+1; j<data.length; j++){
                if(data[i] == data[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
