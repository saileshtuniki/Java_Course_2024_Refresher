//Other method to create a thread



public class ThreadEx6 {
    public static void main(String[] args) throws InterruptedException {
        
        //Threads using Anonymous class 
        // Runnable r1 = new Runnable(){
        //     public void run(){
        //         System.out.println("Hello "+Thread.currentThread().getName() + ">> " + Thread.currentThread().threadId());
        //     }
        // };

        // Runnable r2 = new Runnable(){
        //     public void run(){
        //         System.out.println("Hi "+Thread.currentThread().getName() + ">> " + Thread.currentThread().threadId());
        //     }
        // };

        // same using Lambda Exp bcz Runnable is a FunctionalInterface
        
        // Runnable r1 = () -> System.out.println("Hello "+Thread.currentThread().getName() + ">> " + Thread.currentThread().threadId());

        // Runnable r2 = () -> System.out.println("Hi "+Thread.currentThread().getName() + ">> " + Thread.currentThread().threadId());
        
        //same above code using for loop to print multi stmts
        Runnable r1 = () -> { 
            for(int i=0;i<=10;i++){
            System.out.println("Hello "+Thread.currentThread().getName() + ">> " + Thread.currentThread().threadId());
            }
        };

        Runnable r2 = () -> {
            for(int i=0;i<=15;i++){
            System.out.println("Hi "+Thread.currentThread().getName() + ">> " + Thread.currentThread().threadId());
            }
        };

        Thread t1 = new Thread(r1, "T1");
        Thread t2 = new Thread(r2, "T2"); 

        t1.start();
        t1.sleep(5000); //after 5 seconds t2 will execute
        //t1.join(); 

        t2.start();

        
    }
}