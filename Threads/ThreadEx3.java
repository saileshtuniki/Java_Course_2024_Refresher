
class Employee extends Thread {
 
    @Override
    public void run(){
        System.out.println("Hello "+Thread.currentThread().getName() + ">>" + Thread.currentThread().threadId());
    }
}
class Manager extends Thread{
    public void run(){
        System.out.println("Hi "+Thread.currentThread().getName() + ">>" + Thread.currentThread().threadId());
    }
}
public class ThreadEx3 {
    public static void main(String[] args) {
        Employee t1 = new Employee();
        t1.start();

        Manager t2 = new Manager();
        t2.start();        
        // Thread t2 = new Thread();
        // Thread t3 = new Thread();
        // Thread t4 = new Thread();
        // t2.start();
        // t3.start();
        // t4.start();

        System.out.println(Thread.activeCount());
    }
}


