import java.util.Scanner;

class BiggestOfThreeSimpleIf{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 :");
        int num2 = sc.nextInt();
        System.out.println("Enter num3 :");
        int num3 = sc.nextInt();

        int biggest = num1;
        if(biggest < num2){
            biggest = num2;
        }
        if(biggest < num3){
            biggest = num3;
        }
       
        
        System.out.printf("Biggest value = %d", biggest);
    }
}