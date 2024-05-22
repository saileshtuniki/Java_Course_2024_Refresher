class Human{

    private int age;  //instance var
    private String name;

    // creating Constructor or Default Constructor
    // public Human(){
    //      age = 24;
    //      name = "Sailesh";
    // }

    //Parameterised Constructor using getter & setter
    // public Human(int a, String n){
    //     age = a;
    //     name = n;
    // }
    //Same above code  using this
    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }


    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    // public void display(Human obj1){
    //     System.out.println(obj1.getName()+":"+obj1.getAge());
    //     // System.out.println(name+":"+age);
    // }
    // public void display(){
    //     System.out.println(obj1.getName()+":"+obj1.getAge());
    //     // System.out.println(name+":"+age);
    // }
}
public class ParameterizedEx2 {
    public static void main(String[] args) {
        Human obj1 = new Human(18,"Vamshi");
        //  Human obj3 = new Human(18, "Vamshi");
        // Human obj2 = new Human();


        System.out.println("Constructor: "+obj1.getName()+":"+obj1.getAge());
        // System.out.println("Parameterized Const: "+obj3.getName()+":"+obj3.getAge());
        // obj1.setAge(24);
        // obj1.setName("Sailesh");

        // obj1.display();
        // obj1.display(obj1);
        //obj2.display();
    }
}
