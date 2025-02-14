class BubbleSort{
    static void bubbleSort(int[] data){
        for(int i = 0; i < data.length-1; i++){
            for(int j = i; j < data.length-1; j++){
                if(data[j] > data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] data = {2,1,4,7,2,1,4,5};
        bubbleSort(data);
        System.out.println("After sorting...");
        for(int x : data){
            System.out.print(x + " ");
        }
        System.out.println();

    }
}
