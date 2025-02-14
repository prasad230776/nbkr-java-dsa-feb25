
class JaggedArray {
    public static void main(String[] args) {
        //method1
        int[][] data = new int[3][];
        data[1] = new int[]{1,2,3,4};
        data[2] = new int[]{1,2};
        data[3] = new int[]{5,6,7,8,9};

        //method2
        int[][] data2 = {
            {1,2,3},
            {1,2},
            {7,8,9,0}
        };

        //traversing 
        for(int x[] : data){
            for(int y:x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
