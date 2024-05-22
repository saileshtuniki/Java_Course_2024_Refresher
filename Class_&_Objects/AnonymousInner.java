class A
{
    public void show()
    {
        System.out.println("in A show");
    }
}
public class AnonymousInner {
   public static void main(String[] args) {
    A obj1 = new A()
    //inner class -> which is created in AnonymousInner
    //Anonymous Inner class 
    {
        public void show()
        {
            System.out.println("in new show");
        }
    };
    obj1.show();
   } 
}
