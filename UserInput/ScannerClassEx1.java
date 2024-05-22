import java.util.Scanner;

public class ScannerClassEx1 {
    public static void main(String[] args) {
        
        System.out.println("Enter a num: ");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(num); 
    }
}
