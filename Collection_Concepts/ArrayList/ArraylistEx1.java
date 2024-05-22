import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArraylistEx1 {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<Integer>();
        // List <Integer> nums = Arrays.asList<>(6,5,3,2); 
            nums.add(6);        
            nums.add(5);       
            nums.add(3);        
            nums.add(2);

            System.out.println("index of 2 is: " + nums.get(2));
            //System.out.println(nums.indexOf(5)); // 1
            //System.out.println(nums.indexOf(1000)); //-1

            nums.forEach(n -> System.out.println("forEach_List:"+n));

            for(int n : nums){

                int num = (Integer)n;
                System.out.println("ArrayList: " + n);
            }
            // System.out.println("ArrayList: " + nums);
    }
}
