public class Student {
    private String name;
    private int age;
    String branch;
    int[] marks;
    Student(String name, int age, String branch, int[] marks){
        this.name = name;
        this.age = age;
        this.branch = branch;
        this.marks = marks;
    }
    void display(){
        System.out.printf("Name : %s\n", this.name);
    }

    double average(){
        double sum = 0;
        for(int x : marks){
            sum += x;
        }
        return sum / marks.length;

    }

}
