import java.util.Stack;

public class StackEx1 {
    public static void main(String[] args) {
        Stack <Integer> stk = new Stack <>();

        stk.push(11);
        stk.push(12);
        stk.push(13);
        stk.push(14);
        stk.push(15);

        System.out.println("Stack:" + stk);
        System.out.println("Stack from Top:" + stk.peek()); //15

        stk.pop();
        System.out.println("Stack:" + stk);
    }
}
