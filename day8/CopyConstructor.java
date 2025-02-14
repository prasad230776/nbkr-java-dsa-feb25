class CopyConstructor{
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        Circle c2 = c1; // same as c1
        c2.r = 20;
        System.out.println(c1.getPerimeter());
        System.out.println(c2.getPerimeter());

        Circle c3 = new Circle(c1);
        c1.r = 5;
        System.out.println(c1.getPerimeter());
        System.out.println(c3.getPerimeter());


    }
}
class Circle{
    int r;
    static final double pi = 3.14;
    Circle(int r){
        this.r = r;
    }
    Circle(Circle c){
        this.r = c.r;
    }
    double getPerimeter(){
        double result = Math.round( 2* Circle.pi * this.r*100)/100;
        return result;
    }
}