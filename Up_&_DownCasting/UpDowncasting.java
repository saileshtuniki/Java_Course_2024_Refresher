class A
{
    public void show1(){
        System.out.println("in A show");
    }
}
class B extends A
{
    public void show2(){
        System.out.println("in B show");
    }
}

public class UpDowncasting{
    public static void main(String[] args) {
        //child object is typecasted to a parent class object
        //A obj1 = (A) new B(); //works
        //obj1 is the ref of A so, we cannot call the show2();
        A obj1 = new B(); 
        obj1.show1();


        //Downcating
        B obj2 = (B) obj1;
        obj2.show2();
    }
}
