class A{
    public int divide(int a, int b) throws ArithmeticException {
        if(b == 0)
            throw new ArithmeticException("Division by Zero");
            return a/b;
    }
}

public class ThrowsExcp {
    public static void main(String[] args) {
        A obj = new A();
        try{
            int result = obj.divide(10, 0);
            System.out.println("Result: " + result);
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught: "+ e);
        }
    }
}
