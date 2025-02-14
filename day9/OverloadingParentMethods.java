public class OverloadingParentMethods {
    public static void main(String[] args) {
        Child c = new Child();
        c.add(10, 20, 30);
        Parent p = new Parent();
        p.add(10, 20);

        //can we assign Child object to Parent type variable
        //up casting - implicit casting
        p = c;
        p.add(10, 20);

        //cannot call the child class methods on parent class object
        //p.add(10,20,30); 

        //can we assign Parent object to Child type variable
        //down-casting- require explicit type casting
        Parent p2 = new Parent();
        Child c2 = (Child)p2; 
        //cannot downcast, unless p2 contain Child instance. causes runtime error, passes compilation phase

        //correct mechanism to avoid mistakes
        if(p2 instanceof Child){
            c2 = (Child) p2;
            c2.add(10, 10);
        }

        
        Parent p3 = new Child();
        p3.add(10, 20); // can only call parent methods eventhough it holds child object

        //downcasting
        Child b3 = (Child) p3;  // it works fine, without runtime error, as the parent variable holds child class object
        b3.add(10, 20);
        b3.add(10, 30, 40);
    }
    
}


class Parent{
    void add(int a, int b){
        System.out.println( a+ b);
    }
}

class Child extends Parent{
    void add(int a, int b, int c){
        System.out.println(a + b + c);
    }
    // cannot reduce the visibility
    // private void add(int a, int b){  

    // }

    public void add(int a,  int b){ // can upgrade the visibility

    }

    // int add(int a, int b){

    // }

    //return type wont constitute for considering this method as a overloaded or over ridden method.. gets compile time error
}