import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class UserInputEx1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number: ");



        InputStreamReader in = new InputStreamReader(System.in);
        //If we try to access the bufferReader it will try to access InputStreamReader
        BufferedReader bf = new BufferedReader(in);

       // int num = System.in.read(); // which gives ASCII value

       int num = Integer.parseInt(bf.readLine());
        System.out.println(num);


        bf.close();
        //when we open any file or use any resource our responsibility is to close the resource.
        //not mandatory but needed.
    }
}

//######################################################

// But is the old version Technique to take the user Input