class CreatingArray {
    public static void main(String[] args) {
        int[] data = {1,2,3,4};
        int[] data2;
        data2 = new int[]{1,2,3,4};
        int[] data3 = new int[5];
        for(int i = 0; i < data3.length; i++){
            data3[i] = i + 10;
        }

        // traversing an array
        for(int i = 0; i < data.length; i++){
            System.out.println(data);
        }
        //using for-each
        for(int x: data2){
            System.out.println(x);
        }
    }
}
