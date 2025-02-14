import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrimeNumbers {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);
        for(int i = 1; i <=100; i++){
            service.execute(new IsPrime(i));
        }
        service.shutdown(); // shutdown() prevents new tasks from being submitted and hence can finish the program execution
    }
    
}

class IsPrime implements Runnable{
    int n;
    IsPrime(int n){
        this.n = n;
    }
    public void run(){
        boolean prime = true;
        if(n<2){
            System.out.println(n + ": not a prime");
            return;
        }
        for(int i = 2; i*i <= n; i++){
            if(n % i ==0){
                prime = false;
                break;
            }
        }
        if(prime){
            System.out.println(n + ": is a prime");
        }else{
            System.out.println(n + ": not a prime");
        }

    }
}