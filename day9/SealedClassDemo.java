public class SealedClassDemo {
    
}

sealed class Person permits Student, Employee{

}

final class Student extends Person{

}

non-sealed class Employee extends Person{

}

class Faculty extends Employee{
    
}
