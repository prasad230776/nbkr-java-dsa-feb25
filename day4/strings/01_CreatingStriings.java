class CreatingStrings{
    public static void main(String[] args) {
        String s1 = "hello"; //creates in string pool inside heap
        String s2 = new String("hello"); //creates new object in heap memory outside string pool

        String s3 = "hello";

        // ==compares references
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        // .equals compares content
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        //copying str1 to str2
        String st1 = "hello world";
        String st2 = String.valueOf(st1.toCharArray());

        System.out.println(st1 == st2);
        System.out.println(st1.equals(st2));

    }
}