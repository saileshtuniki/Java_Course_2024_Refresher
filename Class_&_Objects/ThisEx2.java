
//Let's understand the problem if we don't use this keyword by the example given below:

class Student{  
    int rollno;  
    String name;  
    float fee;

    //If instance and local var are same we have to use this keyword 
    //this.rollno=rollno;  
    //this.name=name;  
    //this.fee=fee;
    Student(int rollno,String name,float fee){  
        rollno=rollno;  
        name=name;  
        fee=fee;
        
        // this.rollno=rollno;  
        // this.name=name;  
        // this.fee=fee;
    }

    void display(){
        System.out.println(rollno+" "+name+" "+fee);
    }  
    } 

public class ThisEx2 {
    public static void main(String[] args) {
        Student s1=new Student(111,"ankit",5000f);  
        Student s2=new Student(112,"sumit",6000f); 

        s1.display();  
        s2.display();
    }
}

/*
 o/p is:
    0 null 0.0
    0 null 0.0

    ------------------------------------
    if we use this
    o/p:
    111 ankit 5000.0
    112 sumit 6000.0

 */