class Box<T>{
    T a;
    void setA(T a){
        this.a = a;
    }
    T getA(){
        return a;
    }
}
class GenericsDemo1 {
    public static void main(String[] args) {
        Box<String> b = new Box<>();
        b.setA("Hai");
        System.out.println(b.getA());

        Box<Person> p = new Box<>();
        p.setA(new Person("Ram", 20));
        System.out.println(p.getA());
    }
}

record Person(String name, int age){}
