public class nestedfor {
    public static void main(String[] args) {

        //Ex:1
        // Outer loop
    // for (int i = 1; i <= 2; i++) {
    //     System.out.println("Outer: " + i); // Executes 2 times
    
    //     // Inner loop
    //     for (int j = 1; j <= 3; j++) {
    //         System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
    //     }
    // } 
        
        //Ex:2
        for(int i=1;i<=5;i++){
            System.out.println("Day "+ i);

            for(int j=1;j<=9;j++){
                System.out.println(" "+(j+8)+" -- "+(j+9));
            }
        }
    }
}
