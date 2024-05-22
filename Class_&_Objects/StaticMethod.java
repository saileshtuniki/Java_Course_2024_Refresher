class Mobile {

    String brand;
    int price;
    static String name; 
    
    public static void show(Mobile obj){
        System.out.println(obj.brand + " : "+ obj.price + " : " + name);
    }
}
public class StaticMethod {
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
        
        
        Mobile.name = "Phone";

        Mobile.show(obj1);
        Mobile.show(obj2);
        
        // obj1.show();
        // obj2.show();
    }
}
