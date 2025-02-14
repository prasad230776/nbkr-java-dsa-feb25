public class StringReverse {
    public static void main(String[] args) {
        String s = "Hello";

        int pos = s.length() - 1;
        //String newString = "";
        StringBuilder sb = new StringBuilder();
        while(pos >=0){
            //newString += s.charAt(pos);
            sb.append(s.charAt(pos));
            pos--;
        }
        System.out.println(sb.toString());

    }
}
