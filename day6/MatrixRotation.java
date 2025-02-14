public class MatrixRotation {
    public static void main(String[] args) {
        int[][] data = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int n = 3;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j< n; j++){
                int temp = data[i][j];
                data[i][j] = data[j][i];
                data[j][i] = temp;
            }
        }
        System.out.println("Transposed matrix");
        for(int[]x : data){
            for(int y: x){
                System.out.print(y + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = data[i][j];
                data[i][j] = data[i][n-1-j];
                data[i][n-1-j] = temp;
            }
        }

        for(int[]x : data){
            for(int y: x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
