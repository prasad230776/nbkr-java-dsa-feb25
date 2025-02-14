public class CircleEquals {
    public static void main(String[] args) {
        Circle3 c1 = new Circle3(10);
        Circle3 c2 = new Circle3(10);
        System.out.println(c1.equals(c2));

    }
}


class Circle3{
    int r;
    Circle3(int r){
        this.r = r;
    }
    // public boolean equals(Circle3 c){
    //     return this.r == c.r;
    // }
}