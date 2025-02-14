public class RecordDemo {
    public static void main(String[] args) {
        Student s1 = new Student("siva", 20, "cse");
        System.out.println(s1);

        Student s2 = new Student("siva", 20, "cse");
        System.out.println(s2);

        //check if they are same

       if(s1.equals(s2)){
        System.out.println("both students are same");
       }else{
        System.out.println("different");
       }

    }
    
}

record Student(String name, int age, String branch){}
