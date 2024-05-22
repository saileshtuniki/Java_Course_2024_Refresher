import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.lang.Comparable;
import java.util.List;

class Student implements Comparable<Student>{
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

    public int compareTo(Student other){
        if(this.age > other.age)
                    return 1; // swaps
                else
                    return -1; // won't swap
    }
}



public class ComparableEx1 {
    public static void main(String[] args) {
        
        List<Student> std = new ArrayList<>();

            std.add(new Student(24,"Sailesh"));        
            std.add(new Student(25,"Vamshi"));       
            std.add(new Student(21,"Ajay"));        
            std.add(new Student(18,"Nikhil"));

            //Sorts the specified list in ascending order
            Collections.sort(std);

            for (Student s: std){    
                System.out.println(s);
            }
    }
}
