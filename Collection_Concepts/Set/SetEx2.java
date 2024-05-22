import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class SetEx2 {
    public static void main(String[] args) {
        Set <Integer> nums = new TreeSet <>();
        //TreeSet -> gives the sorted set
            nums.add(62);        
            nums.add(54);       
            nums.add(83);               
            nums.add(92);
            nums.add(15);

            /*In Java, an iterator is an interface provided by the java.util package
             that allows you to iterate over the elements in a collection (such as ArrayList, HashSet, HashMap, etc.) sequentially. 
            It provides methods for traversing through the collection, 
            checking if there are more elements to iterate over, 
            and retrieving the next element in the iteration. */

            Iterator <Integer> values = nums.iterator();

            while (values.hasNext()) {
                System.out.println(values.next());
            }


            // for(int n : nums){

            //     System.out.println("Set: " + n);
            // }
    }    
}
