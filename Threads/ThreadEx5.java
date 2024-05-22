//Other method to create a thread

class Employee implements Runnable {

    
    @Override
    public void run(){
        System.out.println("Hello "+Thread.currentThread().getName() + ">> " + Thread.currentThread().threadId());
    }
}
class Manager implements Runnable{

    @Override
    public void run(){
        System.out.println("Hi "+Thread.currentThread().getName() + ">> " + Thread.currentThread().threadId());
    }
}
public class ThreadEx5 {
    public static void main(String[] args) {
        // e1 is the obj for Runnable
        Employee e1 = new Employee();
        Thread t1 = new Thread(e1, "T1");
        t1.start();

        //m1 is the obj for Runnable
        Manager m1 = new Manager();
        Thread t2 = new Thread(m1, "T2");
        t2.start();

        System.out.println(Thread.activeCount());
    }
}