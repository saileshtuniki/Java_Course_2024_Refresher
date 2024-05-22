class Human{
    private int age;  //instance var
    private String name;  //instance var  
    
    //Here public followed by getter and setter methods used to access private class fields.

    // "this" keyword //
    /* 
    this can be used to refer current class instance variable.
    this can be used to invoke current class method (implicitly).
    this() can be used to invoke current class constructor.
    this can be passed as an argument in the method call.
    this can be passed as argument in the constructor call.
    this can be used to return the current class instance from the method.
    */

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void display(){
        System.out.println(getName()+":"+getAge());
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        Human obj1 = new Human();
        Human obj2 = new Human();

        obj1.setAge(24);
        obj1.setName("Sailesh");

        obj2.setAge(30);
        obj2.setName("Vamshi");

        // System.out.println(obj1.getName()+":"+obj1.getAge());
        // System.out.println(obj2.getName()+":"+obj2.getAge());

        obj1.display();
        obj2.display();
    }
}
