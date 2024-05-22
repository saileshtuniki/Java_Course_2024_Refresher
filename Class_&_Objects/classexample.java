class Calculator  // a class can have methods and variables.
{
    int a; //Instance Variable:- Variable declaration inside class but outside method

     public int add(int num1 , int num2) //Method Declaration inside class
    {
        int r = num1 + num2;
        return r;
    }
}

public class classexample {
    public static void main(String[] args) {
        
        int num1 = 5;
        int num2 = 3;

        //Initializing reference variable->add1
        Calculator add1 = new Calculator(); //creating an object of calculator  and assigning to a ref-variable
        int result = add1.add(num1,num2);
        System.out.println(result);
    }
}
