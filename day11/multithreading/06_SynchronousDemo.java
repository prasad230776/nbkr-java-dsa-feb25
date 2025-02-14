import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//synchronous execution
//when the task is suspended, thread is also suspended
class MultipleThreadsExecutor {
    public static void main(String[] args) {
        int SIZE = 10;

        // Create an ExecutorService that launches a new thread 
        try (ExecutorService executor = Executors.newFixedThreadPool(4)) {
            for (int i = 1; i <= SIZE; i++) {
                executor.execute(new MyThread(i));
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
            Thread.sleep(1);
        } catch (Exception _) {
        } finally {
           System.out.println("Exiting thread no: " + threadId + "  " + Thread.currentThread());
        }
    }
    
}