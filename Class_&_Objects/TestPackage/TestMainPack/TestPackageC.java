
package TestPackage.TestMainPack;

//Here, (.*) -> is denote only files which imports all files in that folder.
import TestPackage.TestMainPack.*;                 // works way-1
// import TestPackage.TestMainPack.TestPackageC;  // works  way-2


import TestPackage.TestA;
import TestPackage.TestB;


public class TestPackageC {
    
    public static void main(String[] args) {
        TestA obj1 = new TestA();
        TestB obj2 = new TestB();

        int r1 = obj1.add(2,3);
        int r2 = obj1.sub(5,3);
        System.out.println("add: "+r1);
        System.out.println("Sub: "+r2);
        
        int r3 = obj2.mul(4,3);
        int r4 = obj2.div(4,3);
        System.out.println("Mul: "+r3);
        System.out.println("Div: "+r4);
    }
}





