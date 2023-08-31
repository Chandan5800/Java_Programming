import java.io.*;
import java.net.*;

public class Client_Java {
    public static void main(String[] args) throws IOException {
        System.out.println("Connecting To Server.........");
        Socket sk = new Socket("10.44.191.208",9090);
        System.out.println("Server is Connected");

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

        PrintStream ps = new PrintStream(sk.getOutputStream());
        BufferedReader br2 = new BufferedReader(new InputStreamReader(sk.getInputStream()));

        while(true){
            String s = br1.readLine();
            if(s.equals("Bye.....")){
                System.exit(1);
            }
            ps.println(s);
            String s1 = br2.readLine();
            System.out.println(s1);
        }
    }
}
