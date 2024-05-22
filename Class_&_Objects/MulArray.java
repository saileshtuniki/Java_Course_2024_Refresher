public class MulArray {
    public static void main(String[] args) 
    {
        int nums [][] = new int [3][4];
         
        
        // prints array in random values using Math
        for(int i=0; i<3;i++) //row
        {
            for(int j=0; j<4;j++){ //Col
                
                nums[i][j] = (int)(Math.random()*100);
                System.out.println(nums[i][j] ); // in Matrix format
            }
            //System.out.println(); //newline after 4 elements
        }


        // Arranging the generated random val in matrix form//
        for(int i=0; i<3;i++) //row
        {
            for(int j=0; j<4;j++)
            { //Col
                // System.out.print(nums[i][j]);
                System.out.print(nums[i][j] + " "); // in Matrix format
            }
            System.out.println();
        }
    }
}
