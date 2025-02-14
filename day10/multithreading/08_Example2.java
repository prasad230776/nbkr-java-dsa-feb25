import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Example2 {
    public static void main(String[] args) {
        //ExecutorService service = Executors.newFixedThreadPool(4);
        ExecutorService service = Executors.newVirtualThreadPerTaskExecutor();
        for(int i =1 ; i<=100; i++){
            //new Thread(new MyThread2(i)).start();
            service.execute(new MyThread2(i));
        }
        service.shutdown();
    }
}

class MyThread2 implements Runnable{
    int num;
    MyThread2(int num){
        this.num = num;
    }
    public void run(){
        System.out.println(num);
    }
}