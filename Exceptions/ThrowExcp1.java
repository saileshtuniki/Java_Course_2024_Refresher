public class ThrowExcp1 {
    public static void main(String[] args) {
         
        int i = 20;
        int j = 0;


        try
        {
            j = 18/i;
            if(j==0)
                throw new ArithmeticException("i don't want to print zero");
            // First, it will try & if the value of j is 0,
            // it will throw the exception and catch will catch that exception. 
            // In, simple if we want to call the catch() block we use throw keyword
        }
        catch(ArithmeticException e)
        {
            j = 18/1;
            System.out.println("This is the default output");   //if j=0 this catch excp occurs
        }
        
        catch(Exception e)
        {
            System.out.println("Something went wrong" + e);
        }

        System.out.println(j);  //j=0

        System.out.println("Bye");

    }
}

