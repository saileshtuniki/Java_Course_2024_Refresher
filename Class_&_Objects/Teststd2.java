//Object and Class Example: Initialization through method

/*In this Ex: we are creating the two objects of Student class 
and initializing the value to these objects by invoking the insertRecord method. 
Here, we are displaying the state (data) of the objects by invoking the displayInformation() method.
*/


class Student2{
    int rollno;
    String name;

    void insertrow(int r, String n ){
        rollno = r;
        name = n;
    }
    void displayinfo(){
        System.out.println(rollno+" "+name);
    }
}


public class Teststd2 {
    public static void main(String[] args) {
        
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();

        s1.insertrow(24, "Vamshi");
        s2.insertrow(25, "Ajay");

        s1.displayinfo();
        s2.displayinfo();
    }
}
