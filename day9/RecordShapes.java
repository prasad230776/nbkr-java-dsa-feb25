public class RecordShapes {
    public static void main(String[] args) {
        Shape s = new Circle(10);
        System.out.println("Circle area = " + s.calculateArea());

        s = new Rectangle(10, 10);
        System.out.println("Rectangle area = " + s.calculateArea());

    }
}

sealed interface Shape permits Circle, Rectangle{
    double calculateArea();
}

record Circle(int r) implements Shape{
    public double calculateArea(){
        return 3.14 * r * r;
    }
}

record Rectangle(int l, int b) implements Shape{
    public double calculateArea(){
        return l*b;
    }
}