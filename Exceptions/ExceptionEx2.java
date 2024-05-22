public class ExceptionEx2 {
    public static void main(String[] args) {
         
        int i = 2;
        int j = 0;

        int nums[] = new int[5];
        String str = null;

        try
        {
            j= 18/i;
            System.out.println(str.length());
            System.out.println(nums[1]);   //0
            System.out.println(nums[5]);   // stay in ur limit
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");   //if i=0 this catch excp occurs
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in ur limit..");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong" + e);
        }

        System.out.println(j);  //j=0

        System.out.println("Bye");

    }
}

