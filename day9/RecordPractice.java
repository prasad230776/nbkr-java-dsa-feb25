public class RecordPractice {
    public static void main(String[] args) {
        Student s1 = new Student("Ram", 10, "cse");
        Student s2 = new Student("Ram", 10,"cse");

        if(s1.equals(s2)){
            System.out.println("both are same students");
        }else{
            System.out.println("Not same");
        }
    }
}

record Student(String name, int age, String group){}