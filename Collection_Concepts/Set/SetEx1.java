import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import java.util.HashSet;

public class SetEx1 {
    public static void main(String[] args) {
        Set <Integer> nums = new HashSet <Integer>();
            nums.add(62);        
            nums.add(54);       
            nums.add(83);               
            nums.add(92);
            nums.add(15);

            // System.out.println(nums);

            for(int n : nums){

                System.out.println("Set: " + n);
            }
    }    
}
