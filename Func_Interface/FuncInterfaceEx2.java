
// Here we will use Lambda Expressions which is used only in @functionalInterfaces

import java.net.Socket;

@FunctionalInterface
interface A
{
    // contains only one abstract method
    // void show(String str);    //abstract method

    void add(int a, int b);
}
public class FuncInterfaceEx2 {
    public static void main(String[] args) {
        // A obj = (String str) -> System.out.println("Hello"+" "+str);

        A obj1 = (int a, int b) -> 
        {
            System.out.println("SUM:" + (a+b));
        };
            // A obj = () ->
            // {
            //     System.out.println("Hello"+" "+str);
            // }
        
        //obj.show("World");
        obj1.add(2,3);
    }
}
