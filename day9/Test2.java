public class Test2 {
    public static void main(String[] args) {
        Object o = "Hello";

        String s = (String)o;
        int l = s.length();
        System.out.println(l);

        Integer i = Integer.valueOf(100);
        o = i;
        int k = (Integer)o;

        if(o instanceof Integer){
            int k2 = (Integer)o;
            if(k2 %2 == 0){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
        }

        if(o instanceof String){
            String s = (String)o;
            System.out.println(s.length());
        }

        if(o instanceof String s1){
            int l1 = s1.length();
            System.out.println(l1);
        }

    }
}
