import java.time.Duration;
import java.time.Instant;

class MultipleThreads {
    public static void main(String[] args) {
        int SIZE = 100000;
        Instant start = Instant.now();
        for(int i= 1; i <=SIZE; i++){
            //new Thread(new MyTestThread(i)).start();
            Thread.startVirtualThread(new MyTestThread(i));
        }
        Instant end = Instant.now();
        long time = Duration.between(start, end).toMillis();
        System.out.println("Time taken: " + time + " millis");

    }
}

class MyTestThread implements Runnable{
    int id;
    MyTestThread(int n){
        id = n;
    }
    public void run(){
        //System.out.println("starting from :" + id + " " + Thread.currentThread());
        try {
            //Thread.sleep(1000);
            int i = 0;
            i++;
        } catch (Exception e) {
            // TODO: handle exception
        }
       // System.out.println("ending from :" + id + " " + Thread.currentThread());
    }
}