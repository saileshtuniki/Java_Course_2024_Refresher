
// Here we will use Lambda Expressions which is used only in @functionalInterfaces

@FunctionalInterface
interface A
{
    // contains only one abstract method
    void show(String str);    //abstract method

}
// class B implements A{
//     public void show()
//     {
//         System.out.println("in  show");
//     }
// }
public class FuncInterfaceEx1 {
    public static void main(String[] args) {
        A obj = new A()
        {
            public void show(String str)
            {
                System.out.println("Hello"+" "+str);
            }
        };
        obj.show("World");
    }
}

// Same code using Lambda Exp 