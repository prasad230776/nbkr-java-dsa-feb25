class MyThread extends Thread{
    public void run(){
        System.out.println("hello world");
    }
}
class MyThtread2 implements Runnable{
    public void run(){
        System.out.println("hello world from runnable");
    }
}

class ThreadDemo{
    public static void main(String[] args) {
        // MyThread obj = new MyThread();
        // obj.start();
        // Thread t = new Thread(new MyThtread2());
        // t.start();
        Thread t1 = new Thread(new Runnable(){
                public void run(){
                    System.out.println("Hello");
                }
        });
        Thread t2 = new Thread(new Runnable(){
                public void run(){
                    System.out.println("world");
                }
        });
        t1.start();
        t2.start();
    }
}