public class StringEx {
    
    public static void main(String[] args) {
        //This will also works 
        //String name ="Sailesh"; // In will also create obj by default -> in most cases well see this
        //String name = new String("Sailesh"); // this and above code is same
        char[] chararr = {'j','a','v','a'};
        String s = "java";
        String chArray = new String(chararr);
        boolean isEqual = s.equals(chArray);
        System.out.println("Are they equal:" + isEqual);
        

        String name = new String("Sailesh");

        System.out.println("Hello " + name);
        System.out.println(name.charAt(2));
        System.out.println(name.concat(" Tuniki"));
        System.out.println(name.length());
        System.out.println(name.substring(1, 3)); //ai
        
    }
}
