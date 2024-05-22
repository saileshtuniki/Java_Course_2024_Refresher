import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {

        System.out.println("Enter any String: ");
        Scanner myobj = new Scanner(System.in);

        String Username = myobj.nextLine();

        System.out.println("Username is: "+ Username);
    }
}
