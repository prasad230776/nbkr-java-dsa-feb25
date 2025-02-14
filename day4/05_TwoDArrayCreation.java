class TwoDArrayCreation {
    public static void main(String[] args) {
        //method1
        int [][] data = {
            {1,2,3},
            {2,3,4},
            {3,4,5}
        };
        //method2
        int[][] data2 = new int[2][2];
        for(int i = 0; i < data2.length; i++ ){
            for(int j = 0; j<data2[i].length; j++){
                data2[i][j] = i*2 + j*3; //just some arbitrary values
            }
        }
        //method3
        int[][] data3;
        data3 = new int[][]{
            {1,2},{3,4}
        };

        //traversing using indexes
        System.out.println("Traversing using indecies");
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j<data[i].length; j++){
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }

        // traversing using for-each
        System.out.println("Traversing using for-each");
        for(int[]x : data){
            for(int y : x){
                System.out.print(y + " ");
            }
            System.out.println();
        }

        //break with label - to break from outer loop
        //the following prints only first two rows
        System.out.println("Breaking with label");
        mylabel:
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j<data[i].length; j++){
                if(i==2){
                    break mylabel;
                }
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }

    }
}
