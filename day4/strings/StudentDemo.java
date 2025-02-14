public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("siva", 20, "cse", new int[]{12,13,14});
        s1.display();
        System.out.println(s1.average());
    }
}
