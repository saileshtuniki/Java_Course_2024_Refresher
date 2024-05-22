class A{
    public A()
    {
        System.out.println("Obj Created");
    }
    public void show()
    {
        System.out.println("in A show method");
    }
}
public class AnonymousObj {
    public static void main(String[] args) {
        new A(); //Anonymous Obj  here we are just creating an object when obj created the constructor will be called
        new A().show();  // Calling show() method using anonymous obj -> here also SAME THE CONSTRUCTOR IS CALLED AND METHOD ASLO
    }
}
