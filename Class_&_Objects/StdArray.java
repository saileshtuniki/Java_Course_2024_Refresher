class StdArray{

    int rollno;
    String name;
    int marks;
    public static void main(String[] args) {
        
        //Array of Students -->Std[]
        StdArray s1 = new StdArray();  //Obj1
        s1.rollno = 200;
        s1.name = "Sailesh";
        s1.marks = 98;
        
        StdArray s2 = new StdArray(); //Obj2
        s2.rollno = 210;
        s2.name = "Ajay";
        s2.marks = 90;

        StdArray s3 = new StdArray(); //Obj3
        s3.rollno = 220;
        s3.name = "Vamshi";
        s3.marks = 88;

        StdArray Std[] = new StdArray[3];
        Std[0] = s1;
        Std[1] = s2;
        Std[2] = s3;

        // for(int i=0; i<Std.length;i++){
        //     //Std[i]-> in every itteration the i value will be changing. 
        //     System.out.println(Std[i].rollno+" "+Std[i].name+" "+Std[i].marks);
        //     //System.out.println(Std[i]); //--> It will print Address
        // }

        //Enhanced Forloop    
        for(StdArray s: Std){
            System.out.println(s.name+ " "+s.rollno+" "+s.marks);
        }


        //Ex: 2 --> For and For Each in Array
        // int nums[] = new int[4];
        // nums[0] = 4;
        // nums[1] = 6;
        // nums[2] = 2;
        // nums[3] = 7;

        // for(int i=0; i<4;i++){
        //     System.out.println(nums[i]);
        // }

        //Enhanced Forloop or For Each in Java 
        // for(int n: nums)            //o/p : 4 6 2 7
        // {
        //     System.out.println(n);
        // }
    }
}