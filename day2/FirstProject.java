import java.util.Scanner;

public class FirstProject {
    public static void main(String[] args) {
        int max = 20;
        int min = 10;
        int value = min + (int)(Math.random()*(max-min + 1));
        // System.out.println("Genearted val :" + value);
        int attempts = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Guess the number between 10 and 20 inclusive or -1 to quit");
            int guessValue = sc.nextInt();
            attempts++;
            if(guessValue == -1){
                System.out.print("Do you really want to quit?(Y/N)");
                String confirm = sc.next().toLowerCase();
                if(confirm == "y") break;
                else{
                    System.out.println("Welcome. try again..");
                }
            }
            if(value == guessValue){
                System.out.println("Your guess is correct, got in "+ attempts + " attempts.");
                break;
            }
            if(value > guessValue){
                System.out.println("Too low, try again");
            }else {
                System.out.println("Too high, try again..");
            }
        }
    }
}
