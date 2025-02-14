class MatrixSum {
    public static void main(String[] args) {
        int[][] matrix1 ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][] matrix2 ={
            {11,12,13},
            {14,15,16},
            {17,18,19}
        };

        int[][] result = new int[3][3];
        for(int i =0; i<matrix1.length; i++){
            for(int j = 0; j<matrix1[i].length;j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // displaying the result matrix
        for(int[] x: result){
            for(int y : x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
