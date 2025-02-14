import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);
        service.execute(new MyThread());
        service.shutdown();;
    }
    
}

class MyThread implements Runnable{
    public void run(){
        System.out.println("Hello world from :" + Thread.currentThread());
    }
}