class Human{

    // private int age;
    // private String name;

    public int age;
    public String name;

    //Parameterized constructor
    public Human(int a, String n){
        age = a;
        name = n;
    }
}
public class ParameterizedEx {
    public static void main(String[] args) {
        Human obj1 = new Human(18, "Vamshi");

        System.out.println(obj1.name+":"+obj1.age);
    }
}
