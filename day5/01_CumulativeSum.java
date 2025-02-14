class CumulativeSum{
    static void display(int[] arr){
        for(int x: arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] data = {1,2,3,4};
        int[] cs = new int[data.length];
        cs[0] = data[0];
        for(int i = 1; i < data.length;i++){
            cs[i] = data[i] + cs[i-1];
        }
        display(cs);
    }
}