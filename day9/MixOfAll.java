public class MixOfAll {
    public static void main(String[] args) {
        Shape s;
        s = new Circle(10);
        double area = findArea(s);
        System.out.printf("Circle area %.2f\n", area);

        s = new Square(10);
        area = findArea(s);
        System.out.printf("Square area %.2f\n", area);
    }

    //using switch expression
    static double findArea(Shape s){
        double area = switch(s){
            case Circle c -> c.area();
            case Square r -> r.area();
        };
        return area;
    }

    //using switch statement
    static double findArea2(Shape s){
        double area;
        switch(s){
            case Circle c : 
                area = c.area();
                break;
            case Square sq : 
                area = sq.area();
                break;
        }
        return area;
    }
}

sealed interface Shape permits Circle, Square{
    double PI = 3.14;
    double area();
}

record Circle(int r) implements Shape{
    public double area(){
        return Shape.PI*r*r;
    }
}

record Square(int l) implements Shape{
    public double area(){
        return l*l;
    }
}