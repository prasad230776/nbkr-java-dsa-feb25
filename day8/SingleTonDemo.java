public class SingleTonDemo {
    public static void main(String[] args) {
        Circle2 c1 = Circle2.getInstance(10);
        Circle2 c2 = Circle2.getInstance(20);
        System.out.println(c1);
        System.out.println(c2);

    }
}

class Circle2{
    private int r;
    private static Circle2 c = null;
    private Circle2(int r){
        this.r = r;
    }
    public static Circle2 getInstance(int r){
        if(c==null){
            c = new Circle2(r);
        }
        return c;
    }
    @Override
    public String toString() {
      return String.format("Circle with radius %d.",r);
    }
}
