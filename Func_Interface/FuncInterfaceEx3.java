interface A{
    int add(int i, int j);
}
public class FuncInterfaceEx3 {
    public static void main(String[] args) {
        A obj = (int i,int j) -> {
            return i+j;
            //one stmt is present return is optional
        };

        int result = obj.add(4,6);
        System.out.println(result);
    }
}
