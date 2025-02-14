public class ShapeDemo {
    public static void main(String[] args) {
        Shape s = new Circle(10);
        double area = s.calculateArea(); //dynamic method despatch
        System.out.println(String.format("%.2f", area));
        
        s = new Rectangle(10, 20);
        area = s.calculateArea(); // calls on reactangle. resolves at runtime
        System.out.println(String.format("%.2f", area));

    }
}

interface Shape{
    double PI = 3.14; //public static final
    double calculateArea(); //public 
}

class Circle implements Shape{
    double r;
    Circle(int r){
        this.r = r;
    }
    public double calculateArea(){ //public is must
        return Shape.PI * r*r;
    }
}

class Rectangle implements Shape{
    double l ,b;
    Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }
    public double calculateArea(){
        return l * b;
    }
}