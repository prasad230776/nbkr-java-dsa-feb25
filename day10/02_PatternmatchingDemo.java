 class PatternmatchingDemo {

    public static void main(String[] args) {
        Shape s;
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        s = c;
        s.area();

        s = r;
        s.area();

        //if we want to use shape variable to call child class methods we need to know which object it is holding
        if(s instanceof Circle){
            Circle c2 = (Circle)s;
            c2.areaC();
        }
        //using pattern matching with if
        if(s instanceof Circle cobj){
            cobj.areaC();
        }

        if(s instanceof Rectangle){
            Rectangle r2 = (Rectangle)s;
            r2.areaR();
        }

         //using pattern matching with if
         if(s instanceof Rectangle robj){
            robj.areaR();
        }

        //using pattern matching with switchexpression
        switch(s){
            case Circle cs-> cs.areaC();
            case Rectangle rs -> rs.areaR();
            default -> System.out.println("default case");
        }


    }
    
}

class Shape{
    void area(){
        System.out.println("from shape");
    }
}

class Circle extends Shape{
    void area(){
        System.out.println("from circle override");
    }
    void areaC(){
        System.out.println("from circle own method");
    }
}

class Rectangle extends Shape{
    void area(){
        System.out.println("from rectangle");
    }
    void areaR(){
        System.out.println("from rectangle own method");
    }
}