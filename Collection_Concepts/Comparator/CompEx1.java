
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompEx1 {
    public static void main(String[] args) {
        
        Comparator<Integer> comp = new Comparator<Integer>()
        {
            public int compare(Integer i, Integer j)
            {
                if(i%10 > j%10)
                    return 1; // swaps
                else
                    return -1; // won't swap
            }
        };
        List<Integer> nums = new ArrayList<Integer>();
            nums.add(43);        
            nums.add(51);       
            nums.add(27);        
            nums.add(14);

            //Sorts the specified list in ascending order
            Collections.sort(nums, comp);

            System.out.println(nums);
    }
}