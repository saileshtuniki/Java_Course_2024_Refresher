
class Calc{
    public int add( int n1, int n2){
        return n1 + n2;
    }
    public int sub( int n1, int n2){
        return n1 - n2;
    }
}
//Here, AdvCalc --> (Sub class) has the properties of parent class i.e Calc --> (super class)
// we use extends keyword. 
class AdvCalc extends Calc{
    public int mul(int  n1, int n2){
        return n1*n2;
    }
    public int div(int  n1, int n2){
        return n1/n2;
    }
}

public class Inheritence {

    public static void main(String[] args) {

        // AdvCalc obj1 = new AdvCalc();
        VeryAdvCalc obj1 = new VeryAdvCalc();

        int r1 = obj1.add(10,2);
        int r2 = obj1.sub(5,3);
        int r3 = obj1.mul(10,4);
        int r4 = obj1.div(15,4);
        double r5 = obj1.power(4,2);

        System.out.println(r1); //12
        System.out.println(r2); //2
        System.out.println(r3); //40
        System.out.println(r4); //3
        System.out.println(r5);
    }

    
    
}