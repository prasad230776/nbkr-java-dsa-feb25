enum Color{
    //constants should be defined at first place before other stuff
    RED("#ff0000"), GREEN("#00FF00"),BLUE("0000FF");

    String colorCode;
    Color(String code){
        this.colorCode = code;
    }

    String getCode(){
        return this.colorCode;
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        Color c1 = Color.RED; // constructor is invoked for RED
        String code = c1.getCode(); // calling method on enum instance
        System.out.println(code);

        //using enum values in switch expression
        String result = enumInSwitch(c1);
        System.out.println(result);

    }

    static String enumInSwitch(Color c){
        //we dont require default when we color all possible enum values
        String result = switch(c){
            case Color.RED -> "Red" + c.colorCode;
            case Color.BLUE ->{ // if multiple lines of code is required
                String answer = "Given color is red and its code is " + c.getCode();
                yield answer;
            }
            case Color.GREEN -> "Green " + c.getCode();
            default->"invalid color"; // optional
        };
        return result;
    }
    
}
