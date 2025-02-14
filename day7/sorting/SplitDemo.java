public class SplitDemo {
    public static void main(String[] args) {
        String s1 = "hello how are you";
        String[] arr = s1.split(" ");
        String res = "";
        int size = arr.length;
        for(int i = size-1; i >= 0; i--){
            res = res + arr[i] + " ";
        }
        res = res.trim();
        System.out.println(res);
    }
}
