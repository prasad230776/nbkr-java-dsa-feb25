import java.util.Scanner;

class BiggestOfThree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 :");
        int num2 = sc.nextInt();
        System.out.println("Enter num3 :");
        int num3 = sc.nextInt();

        int biggest;
        if(num1 > num2){
            if(num1 > num3){
                biggest = num1;
            }else{
                biggest = num3;
            }
        }else{
            if(num2 > num3){
                biggest = num2;
            }else{
                biggest = num3;
            }
        }
    }
}