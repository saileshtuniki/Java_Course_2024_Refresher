import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEx1 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
            nums.add(43);        
            nums.add(51);       
            nums.add(27);        
            nums.add(14);

            //Sorts the specified list in ascending order
            //passing nums Obj in Collections sort method.
            Collections.sort(nums);

            System.out.println(nums);
    }
}
