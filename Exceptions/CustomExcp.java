class SaileshException extends Exception{
    public SaileshException (String str)
    {
        super(str);
    }
}


public class CustomExcp {
    public static void main(String[] args) {
         
        int i = 20;
        int j = 0;


        try
        {
            j = 18/i;
            if(j==0)
                throw new SaileshException("I don't want to print zero");
        }
        catch(SaileshException e)
        {
            j = 18/1;
            System.out.println("This is the default output" + e);  
        }
        
        catch(Exception e)
        {
            System.out.println("Something went wrong" + e);
        }

        System.out.println(j);  

        System.out.println("Bye");

    }
}

