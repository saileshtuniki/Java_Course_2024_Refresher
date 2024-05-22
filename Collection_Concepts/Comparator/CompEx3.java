import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int age;
    String name;

    public Student (int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student: [age= " + age +", name= " + name +"]"; 
    }
}



public class CompEx3 {
    public static void main(String[] args) {
        
        // (Student i, Student j) -> we don't need to mention the type of it
        // using terenary operator
        Comparator<Student> comp =  ( i,  j) -> i.age > j.age ? 1 : -1 ;
                
        
        List<Student> std = new ArrayList<>();

            std.add(new Student(24,"Sailesh"));        
            std.add(new Student(25,"Vamshi"));       
            std.add(new Student(21,"Ajay"));        
            std.add(new Student(18,"Nikhl"));

            //Sorts the specified list in ascending order
            Collections.sort(std, comp);

            for (Student s: std){    
                System.out.println(s);
            }
    }
}
