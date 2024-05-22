class Student1 {
    int id;
    String name;
}

class Teststd1{
    public static void main(String[] args){

        //Creating objects  
        Student1 std1 = new Student1();

        //Initializing objects 
        std1.id = 101;
        std1.name = "Sailesh";

        //Printing data 
        System.out.println(std1.id+ " "+std1.name);
    }
}
