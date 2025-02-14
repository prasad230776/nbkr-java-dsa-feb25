import java.util.stream.Stream;

class Lambda {
    static Stream<String> s = Stream.of("Banana", "Apple", "Grapes");
    static void forEachDemo(){
        s.forEach(alpha->System.out.println(alpha));
    }
    static void mapDemo(){
        Stream<String> s2 = s.map(fruit-> fruit.toUpperCase());
        s2.forEach(f -> System.out.println(f));
    }

    static void predicateDemo(){
        s.filter(data->data.startsWith("A"))
        .forEach(x->System.out.println(x));

    }
    static void reduceDemo(){
        String result = s.reduce("NBK ", (a, b)-> a + " "+ b);
        System.out.println(result);
    }
    public static void main(String[] args) {
        //forEachDemo();
        //mapDemo();
        reduceDemo();


    }
}
