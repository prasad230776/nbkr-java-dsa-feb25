public class LinearSearch {
    static boolean linearSearch(int[] data, int key){
        for(int x : data){
            if(x == key){
                return true;
            }
        }
        return false;
    }
    static boolean binarySearch(int[] data, int key){

        int lptr = 0; 
        int rptr = data.length - 1;
        while(lptr <= rptr){
            int mid = (lptr + rptr) / 2;
            if (data[mid]==key) {
                return true;
            }
            if(data[mid] < key){
                rptr = mid -1;
            }else{
                lptr = mid + 1;
            }
        }
        return false;
    }

    static boolean bsRecursion(int[] data, int key, int l, int r){
        if(l > r){
            return false;
        }
        int mid = (l + r)/2;
        if(data[mid] == key) return true;
        if(data[mid] < key) {
            return bsRecursion(data, key, l, mid-1);
        }else{
            return bsRecursion(data, key, mid+1, r);
        }
    }

    public static void main(String[] args) {
        int[] data = {2,1,4,90};
        System.out.println(bsRecursion(data, 0,0,data.length-1));
    }
}
