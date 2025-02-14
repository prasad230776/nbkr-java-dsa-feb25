public class Circle {
    int radius;
    static int count;
    Circle(int r){
        this.radius = r;
        count++;
    }
}

class CircleDemo{
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(20);
        Circle c3 = new Circle(30);
        Circle c4 = new Circle(40);
        System.out.println(Circle.count);
    }
}