public class StringsEqual {
    static boolean isEqual(String st1, String st2){

        int l1 = st1.length();
        int l2 = st2.length();
        if(l1 != l2){
            return false;
        }
        for(int i = 0; i<l1; i++){
            if(st1.charAt(i) != st2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isEqual("abc", "abc"));
    }
}
