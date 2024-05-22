public class ThreeDArr {
    public static void main(String[] args) 
    {
        int nums [][][] = new int [3][4][5];
         
        
        // prints array in random values using Math
        for(int i=0; i<3;i++) //row
        {
            for(int j=0; j<4;j++)
            { //Col
                for(int k=0;k<5;k++){
                    nums[i][j][k] = (int)(Math.random()*100);
                    System.out.println(nums[i][j][k] ); // in Matrix format
                }   
                System.out.println(); 
            }
            System.out.println(); //newline after 4 elements
        }


        // Arranging the generated random val in matrix form//
        for(int i=0; i<3;i++) //row
        {
            for(int j=0; j<4;j++)
            { //Col
                for(int k=0;k<5;k++){
                    System.out.print(nums[i][j][k] + " "); // in Matrix format
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
