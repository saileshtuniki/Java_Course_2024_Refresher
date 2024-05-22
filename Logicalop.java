public class Logicalop {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        
        // Logical AND -> Returns true if both statements are true
        System.out.println("a && b: " + (a && b));
        
        // Logical OR -> Returns true if one of the statements is true
        System.out.println("a || b: " + (a || b));
        
        // Logical NOT -> Reverse the result, returns false if the result is true
        System.out.println("!a: " + (!a));
    }
}
