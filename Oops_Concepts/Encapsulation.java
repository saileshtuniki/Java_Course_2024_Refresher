class Human{
    private int age;
    private String name;
    
    //Here public followed by getter and setter methods used to access private class fields.
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        Human obj1 = new Human();
        Human obj2 = new Human();

        obj1.setAge(24);
        obj1.setName("Sailesh");

        obj2.setAge(30);
        obj2.setName("Vamshi");

        System.out.println(obj1.getName()+":"+obj1.getAge());
        System.out.println(obj2.getName()+":"+obj2.getAge());
    }
}
