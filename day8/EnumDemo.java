enum Day{
    SUNDAY('0'),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THRUSDAY(4),
    FRIDAY(5),
    SATURDAY(6);
    int n;
    Day(int n){
        this.n = n;
    }
    int getDay(){
        return this.n;
    }

}

class EnumDemo{
    public static void main(String[] args) {
        Day day = Day.MONDAY;
        switch(day){
            case Day.MONDAY:
            System.out.println("it is monday and day number is " + Day.MONDAY.getDay());
            break;
            case Day.TUESDAY:
            System.out.println("it is tuesday");
            break;
            case Day.WEDNESDAY:
            System.out.println("it is wed");
            break;
            default:
            System.out.println("othes");

        }
    }
}