package OOP;
import java.util.Objects;

public class Person {
    // properties
    protected String name;
    protected int age;
    
    // methods
    // constructor: 
    public Person(){
        
    }
    
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
     
    public void speak(){
        System.out.println("My name is " + this.name + " and I'm " + this.age);
    }
    
    // getter and setter 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    // ghi đè phương thức toString trong class Object 
    @Override
    public String toString(){
        return "Hello my name is " + this.name + " and I'm " + this.age;
    }
    
    @Override
    public boolean equals(Object other){
        if (this == other) 
            return true;
        if (other == null)
            return false;
        
        if(!(this.getClass() == other.getClass()))
            return false;
        Person newOther = (Person) other;
        return this.name.equals(newOther.name) && this.age == newOther.age;
    }
}
