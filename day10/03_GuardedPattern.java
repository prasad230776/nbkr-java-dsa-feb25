class GuardedPattern{
    public static void main(String[] args) {
        
        Integer i = 89;
        String ans = switch(i){
            case Integer i1 when i1 % 2 == 0 -> {
                System.out.println("even");
                yield "Even";
            }
            case Integer i1 when i1 % 2 != 0 -> {
                System.out.println("even");
                yield "Odd";
            }
            default -> {
                 System.out.println("invalid");
                 yield "in valid";
            }

        };
       
        String result = switch(Integer.valueOf(100)){
            case Integer i1 when i1 % 2 == 0 -> "even";
            case Integer i1 when i1 % 2 != 0 -> "odd";
            default -> "invalid";

        };
        
        Object o = i;
        String a = switch(o){
            case Integer _ -> "number"; //what is _ ?
            default -> "not a number";   
        };
        
        String a2 = switch(i){
            case Integer _ -> "number";
            //default -> "not a number";   default should not be there ? First case itself is matching will all cases.
        };

        //for a sealed entities
        Shape s = new Circle(10);
        double area = switch(s){
            case Circle c -> c.findArea();
            case Square sq -> sq.findArea();
            default ->0;
        };


    }
}

sealed interface Shape permits Circle, Square {
    //double findArea();
}

record Circle(int  r) implements Shape{
    public double findArea(){
        return 3.14*r*r;
    }
}

record Square(int l) implements Shape{
    public double findArea(){
        return l*l;
    }
}
