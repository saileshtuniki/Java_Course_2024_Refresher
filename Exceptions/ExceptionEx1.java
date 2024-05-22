public class ExceptionEx1 {
    public static void main(String[] args) {
         
        int i = 0;
        int j = 0;

        try
        {
            j= 18/i;
        }catch(Exception e){
            System.out.println("Something wrong"+e);
        }

        System.out.println(j);  //j=0

        System.out.println("Bye");

    }
}
