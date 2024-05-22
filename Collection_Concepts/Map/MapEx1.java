import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class MapEx1 {
    public static void main(String[] args) {
        Map <String, Integer>  students = new LinkedHashMap<>(); // ordered form i.e from "sailesh"->"Pranay"
        // Map <String, Integer>  students = new HashMap<>();

        // If we use TreeMap<>(); -> we can return the key value pair in ascending order.
        // Map <String, Integer>  students = new TreeMap<>(); 


        students.put("Sailesh", 59);
        students.put("Sai", 41);
        students.put("Vamshi", 49);
        students.put("Ajay", 54);
        students.put("Pranay", 60);

        System.out.println(students);  // return key and value pair in set -> unordered form.

        System.out.println(students.keySet()); // return the set of Keys 

        for (String name : students.keySet())
        {
            System.out.println(name + ":" + students.get(name));
        }
    }
}
