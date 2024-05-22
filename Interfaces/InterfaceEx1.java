interface A{
    int age = 24;
    
    void show();
    void config();
} 
class B implements A{
    public void show(){
        System.out.println("in show");
    }

    public void config(){
        System.out.println("in config");
    }
}

public class InterfaceEx1 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();

        // A.age = 25; -> wont work we cannot assign value to static and final variable

        System.out.println(A.age);
    }
}
