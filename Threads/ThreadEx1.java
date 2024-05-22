// if we want to make this class as thread, class extends thread

class A extends Thread{
    public void run(){

        for(int i=1;i<=10;i++){
        System.out.println("hi");
        }
    }
}
class B extends Thread{
    public void run(){

        for(int i=1;i<=10;i++){
        System.out.println("Hello");
        }
    }
}
public class ThreadEx1 {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}
