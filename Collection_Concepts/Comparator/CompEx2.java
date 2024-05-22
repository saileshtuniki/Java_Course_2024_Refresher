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



public class CompEx2 {
    public static void main(String[] args) {
        
        Comparator<Student> comp = new Comparator<Student>()
        {
            public int compare(Student i, Student j)
            {
                if(i.age > j.age)
                    return 1; // swaps
                else
                    return -1; // won't swap
            }
        };
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