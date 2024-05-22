class Outerclass{
    int age;
    public void show()
    {
        System.out.println("in Show");
    }
class Inner
{
    public void config(){
        System.out.println("in config");
    }
}
}

public class Innerclass {
    public static void main(String[] args) {
        Outerclass obj1 = new Outerclass();
        obj1.show();
        //If the inner class is no need to create the object
        // Outerclass.Inner obj2 =  new Outerclass.Inner();
        Outerclass.Inner obj2 =  obj1.new Inner();
        obj2.config();
    }
}
 