class A{
   public int add(int n1 , int n2){
        return n1+n2;
    }
}
class B extends A{
    public int add(int n1 , int n2){
        return n1+n2+1;
    }
    // public void show(){
    //     System.out.println("in B show()");
    // }
}

// Here add() in class B is overriding the method in class A add()
public class MethodOverriding {
    public static void main(String[] args) {
         B obj1 = new B();
         int r1 = obj1.add(10,2);
         System.out.println(r1); 
    }
}
