//Jagged Array or irregular Array
/*A jagged array in Java is a collection of arrays where each array may contain a varied number of elements. 
A two-dimensional array, in contrast, requires all rows and columns to have the same length. */

public class JaggedArr {
    public static void main(String[] args) 
    {
        int nums [][] = new int [3][]; // Jagged 
         
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];
        
     
        for(int i=0; i<nums.length;i++) //row
        {
            for(int j=0; j<nums[i].length;j++){  // Col                
                nums[i][j] = (int)(Math.random()*100);
                
            }
        }

        // Note: Plus point that no need to mention size in Enhanced forloop
        for(int n[] : nums)
        {
            for(int m: n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
