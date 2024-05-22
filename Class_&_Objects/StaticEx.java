
class Mobile {
    String brand;
    int price;
    // When we declare ststic to a variable it reflets to all objs 
    static String name; 
    
    public void show(){
        System.out.println(brand + " : "+ price + " : " + name);
    }
}

public class StaticEx {
    public static void main(String[] args) {
        
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1100;
        //obj1.name = "SmartPhone";
        //we can access using classname.<staticvariablename>
        // Mobile.name = "SmartPhone";


        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 999;
        // Mobile.name = "Smartphone";

        // obj1.name = "Phone";
        Mobile.name = "Phone";

        obj1.show();
        obj2.show();

    }
}
