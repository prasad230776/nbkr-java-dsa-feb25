class InnerClassDemo {
    public static void main(String[] args) {
        Shape s = new Shape(){
            public double area(int r){
                System.out.println("from circle");
                return 3.14*r*r;
            }
        };

        double area = s.area(30);
        System.out.println(area);
    }
}
interface Shape{
    double area(int r);
}