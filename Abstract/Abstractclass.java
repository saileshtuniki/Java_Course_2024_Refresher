abstract class Car
{
    abstract void drive();
    public void playmusic(){
        System.out.println("playing Music...");
    }
}
class BMW extends Car
{                                   //Here, BMW class also called as -> concrete class 
    public void drive(){
        System.out.println("Driving...");
    }
}
public class Abstractclass {
    public static void main(String[] args) {
        Car obj1 = new BMW();
        obj1.drive();
        obj1.playmusic();
    }
    
}
