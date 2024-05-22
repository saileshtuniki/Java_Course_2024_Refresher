import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ForEachEx1 {
    public static void main(String[] args) {
        
        // ArrayList <Integer> nums = new ArrayList<Integer>();
        // Arrays.asList -> we can directly give the elements, no need to add.
        List <Integer> nums = Arrays.asList(6,5,3,2);  
        // nums.add(6);        
        // nums.add(5);       
        // nums.add(3);        
        // nums.add(2);

        nums.forEach(n -> System.out.println("forEach_List:"+n));
    }
}
