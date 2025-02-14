class HelloWorldPrint{
    public static void main(String[] args) {
        MyPrinter printer = new MyPrinter("MyPrinter");
        printer.start();

        System.out.println("Implementing runnable");
        Thread t = new Thread(new MyPrinter2("RunnableThread2"));
        t.start();
    }
}

class MyPrinter extends Thread{
    MyPrinter(String name){
        super(name);
    }
    public void run(){
        System.out.println("Printing from " + Thread.currentThread());
        System.out.println("Hello world");
    }
}

class MyPrinter2 implements Runnable{
    String name;
    MyPrinter2(String name){
        this.name = name;
    }
    public void run(){
        Thread.currentThread().setName(name);
        System.out.println("Printing from " + Thread.currentThread());
        System.out.println("Hello world");
    }

}