public class ThreadEx2 {
    public static void main(String[] args) {
        System.out.println("Thread Concept:");

        System.out.println(Thread.activeCount()); // returns the no.of threads performing count. 
        System.out.println(Thread.currentThread().getName()); //getName()-> returns threads name.
        //to get ID
        System.out.println(Thread.currentThread().threadId()); // id is 1

        //Thread Priority
        System.out.println(Thread.currentThread().getPriority()); // priority Ranges from 1 to 10 (Min or Max)
    }   
}
