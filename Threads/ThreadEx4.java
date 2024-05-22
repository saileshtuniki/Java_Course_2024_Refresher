// Adding name to threads

class Employee extends Thread {

    // Adding name to threads using constructor
    public Employee (String tname){
        super(tname);
    }
    @Override
    public void run(){
        System.out.println("Hello "+Thread.currentThread().getName() + ">> " + Thread.currentThread().threadId());
    }
}
class Manager extends Thread{

    // Adding name to threads using constructor
    public Manager (String tname){
        super(tname);
    }
    public void run(){
        System.out.println("Hi "+Thread.currentThread().getName() + ">> " + Thread.currentThread().threadId());
    }
}
public class ThreadEx4 {
    public static void main(String[] args) {
        Employee t1 = new Employee("T1");
        t1.start();

        Manager t2 = new Manager("T2");
        t2.start();        

        // System.out.println(Thread.activeCount());
    }
}