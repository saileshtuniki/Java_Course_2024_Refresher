class A{
    public void show() throws ClassNotFoundException
    {
        Class.forName("Class_B");
    }
}
public class ThrowsEx2 {
    static {
        System.out.println("CLass Loaded");
    }
    public static void main(String[] args) {
        A obj = new A();
        
        try {
            obj.show();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Class not found" + e);
        }
    }
}
