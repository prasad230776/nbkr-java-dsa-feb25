class MatrixMultiplication {
    public static void main(String[] args) {
        int [] [] m1 = {
            {1,2,3},
            {4,5,6}
        };
        int []m2[] ={
            {1,2},
            {2,3},
            {3,4}
        };

        int rows = 2 ; //m1.length;
        int cols = 2; //m2[0].length;
        int t = 3; // m1[0].length;
        int[][] result = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                for(int k = 0; k < t; k++){
                    result[i][j] += m1[i][k] + m2[k][j];
                }
            }
        }

        for(int x[] : result){
            for(int y: x){
                System.out.print(y + " ");
            }
            System.out.println();
        }

    }
}
