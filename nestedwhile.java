public class nestedwhile {
    public static void main(String[] args) {
        int i = 1;
        while(i<=5)
        {
            System.out.println("Hi"+" "+ i);
            int j = 1;
            while(j<=4){
                System.out.println("Hello"+" "+ j);
                j++;
            }
            i++;
        }
        // System.out.println("bye" + i); //bye6 will be printed
    }
}
