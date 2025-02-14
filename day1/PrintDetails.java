import java.util.Scanner;

class PrintDetails{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Read name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);

    }
}
