public class EnumPractice {
    public static void main(String[] args) {
        Color c = Color.RED;
        switch (c) {
            case Color.RED:
                System.out.println("RED " + c.getCode());
                break;
            case Color.BLUE:
                System.out.println("Blue " + c.getCode());
                break;
            case Color.GREEN:
                System.out.println("Green " + c.getCode());
                break;
            default:
                break;
        }
    }
    
}

enum Color{
    RED("#FF0000"),
    BLUE("#0000FF"),
    GREEN("#00FF00");

    String code;
    Color(String code){
        this.code = code;
    }

    String getCode(){
        return this.code;
    }

}
