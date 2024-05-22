abstract class A{
    public abstract void show();
}
// class B extends A{

// }

public class AbsAnonymousInner {
    
    public static void main(String[] args) {
        A obj = new A()
        {
            public void show(){
                System.out.println("in new show");
            }
            //multiple methods also can be implemented
        };
        obj.show();
    }
}
 