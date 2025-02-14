import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//asynchrounous operation
//If a virtual thread is suspended (e.g., due to Thread.sleep(), waiting for I/O, etc.), the carrier  thread is freed and can execute another virtual thread.
class MultipleThreadsVirtual {
    public static void main(String[] args) {
        int SIZE = 10;

        // Create an ExecutorService that launches a new virtual thread per task
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 1; i <= SIZE; i++) {
                executor.submit(new MyThread(i));
            } 
        } // Executor auto-closes and waits for tasks to finish
    }
}

class MyThread implements Runnable{
    int threadId;
    MyThread(int id){
        threadId = id;
    }
    public void run(){
        System.out.println("Entering thread no: " + threadId + "  " + Thread.currentThread());
        try {
            Thread.sleep(1000);
        } catch (Exception _) {
        } finally {
            System.out.println("Exiting thread no: " + threadId + "  " + Thread.currentThread());
        }
    }
    
}