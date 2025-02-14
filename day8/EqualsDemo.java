public class EqualsDemo {

    public static void main(String[] args) {
        Person p1 = new Person("Siva", 45);
        Person p2 = new Person("Siva", 45);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1 == p2);
    }
    
}

class Person{
    String name; 
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString2() {
        String deatils = String.format("Name : %s \n Age : %d", name, age);
        return deatils;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        return result;
    }
    public boolean equals2(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        return true;
    }
   

}