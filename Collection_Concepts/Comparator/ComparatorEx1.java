import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ComparatorEx1 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
            
            nums.add(6);        
            nums.add(5);       
            nums.add(3);        
            nums.add(2);

            //Sorts the specified list in ascending order
            Collections.sort(nums);

            System.out.println(nums);
    }

}
