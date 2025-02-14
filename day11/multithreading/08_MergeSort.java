import java.util.Arrays;

class MergeSortDemo {

    static void mergeSort(int[] array){
        int length = array.length;
        if(length < 2) return;
        int left = 0;
        int right = array.length;
        int mid = (left+right)/2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length - mid];
        for(int i = 0; i < mid ; i ++){
            leftArray[i] = array[i];
        }
        for(int j = mid; j < length ; j ++){
            rightArray[j-mid] = array[j];
        }
        merge(leftArray, rightArray, array);

    }

    static void merge(int[] leftArray, int[] rightArray, int[] array){
        int left = leftArray.length;
        int right = rightArray.length;
        int i = 0, j = 0, k = 0;
        while(i < left && j < right){
            if(leftArray[i] <= rightArray[j]){
                array[k] = leftArray[i];
                i++;
            }else{
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i < left){
            array[k] = leftArray[i];
            i++;k++;
        }
        while(j < right){
            array[k] = rightArray[j];
            j++;k++;
        }
    }

    public static void main(String[] args) {
        int[] data = {3,1, 6};
        System.out.println("before merge: " + Arrays.toString(data));
        mergeSort(data);
        System.out.println("after merge: " + Arrays.toString(data));
    }
}


