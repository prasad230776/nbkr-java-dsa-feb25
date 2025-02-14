public class Reverse{
    public static void main(String[] args) {
        String st1 = "Hello";
        StringBuilder sb1 = new StringBuilder();
        for(int index = st1.length() - 1; index >=0; index --){
            sb1.append(st1.charAt(index));
        }
        System.out.println(sb1.toString());
    }
}