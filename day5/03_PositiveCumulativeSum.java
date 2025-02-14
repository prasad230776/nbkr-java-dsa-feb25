import java.util.ArrayList;

class PositiveCumulativeSum{
    static void display(ArrayList<Integer> arr){
        for(int x: arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] data = {1,-2,3,4};
        int[] cs = new int[data.length];
        ArrayList<Integer> pcs = new ArrayList<>();
        cs[0] = data[0];
        if(cs[0]>0){
            pcs.add(cs[0]);
        }
        for(int i = 1; i < data.length;i++){
            cs[i] = data[i] + cs[i-1];
            if(cs[i] > 0){
                pcs.add(cs[i]);
            }
        }
        display(pcs);
    }
}