class PrintNumbers {
    public static void main(String[] args) {
        int n = 10;
        for(int i = 1; i <=10; i++){
            Thread t = new Thread(new NumberPrinter(i));
            t.start();
        }
    }
    
}

class NumberPrinter implements Runnable{
    int value;
    NumberPrinter(int value){
        this.value =value;
    }
    public void run(){
        System.out.println(value + " From thread:" +Thread.currentThread() );
    }
}