public class Assignmentop {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        //Assignment
        int c = a;
        System.out.println("c = "+ c);

        //Addition Assign
        //c =c+b
        c += b;
        System.out.println("c += b:" + c);
        
        //sub assign
        c -= b;
        System.out.println("c -= b:" +c);

        //mul assign
        c *= b;
        System.out.println("c *= b:" +c);

        //div assign
        c /= b;
        System.out.println("c /= b:" +c);

        //Modulo Assign (Reminder)
        c %= b;
        System.out.println("c %= b:" +c);

    }
}
