/*Super() :- Super by default calls the parent class constructor, 
if we have any parameterized constructor we have to mention parameter in super() explicitly to call the parameter constructors */ 

/*Super by default it will be there in constructor like mentioned below,
 if we want to change anything we have to mention super() keyword */


//Here, in class A if we dont mention extends Object by default the Object will be present.
class A extends Object{
    public A(){
        System.out.println("in A");
    }
    public A(int n){
        System.out.println("in A int");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("in B");
    }
    public B(int n){
        // super(n);
        this();
        System.out.println("in B int");
    }
}
public class SuperEx1 {
    public static void main(String[] args) {
        B obj1 = new B(2);
    }
}
