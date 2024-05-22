public class StrBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Sailesh");

        sb.append(" Vamshi");
        // sb.reverse();
        sb.replace(8, 14, " Tuniki");
        sb.insert(8, "Vamshi");


        System.out.println(sb);
    }
}
