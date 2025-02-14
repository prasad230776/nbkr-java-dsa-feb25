import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

class IntStream {
    //traverse each element
    static Stream<Integer> is = Stream.of(1,2,3,6,4);
    static void forEachDemo(){
        Consumer<Integer> c = new Consumer<>() {

            @Override
            public void accept(Integer t) {
                System.out.println(t);
            }
            
        };
        is.forEach(c);
    }

    static void filterDemo(){
        //print even values
        Predicate<Integer> p = new Predicate<Integer>() {
            public boolean test(Integer i){
                return i % 2==0;
            }
        };
        is.filter(p)
        .forEach(e->System.out.print(e + " "));
        System.out.println();
    }

    static void mapDemo(){
        //double the numbers
        Function<Integer, Integer> f = new Function<>() {
            @Override
            public Integer apply(Integer t) {
               return t*t;
            }   
        };
        is.map(f)
        .forEach(e->System.out.println(e));
    }

    static void reduceDemo(){
        //sum all the values
        BinaryOperator<Integer> bo = new BinaryOperator<Integer>() {
            public Integer apply(Integer a, Integer b){
                return a+ b;
            }
        };
        

        int sum = is.reduce(0, bo);
        //int sum = is.reduce(0, (a, b)->a+b);
        System.out.println(sum);
    }

    public static void main(String[] args) {
       // forEachDemo();
       // filterDemo();
       // mapDemo();
      reduceDemo();

    }
}

