import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

 import java.io.*;
        import java.net.*;

public class Server_Java {
    public static void main(String[] args) throws IOException {
        System.out.println("Waiting For Server.........");
        ServerSocket ssk = new ServerSocket(9090);
        Socket sk = ssk.accept();
        System.out.println("Client is Connected");

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

        PrintStream ps = new PrintStream(sk.getOutputStream());
        BufferedReader br2 = new BufferedReader(new InputStreamReader(sk.getInputStream()));

        while(true){
            String s = br1.readLine();
            if(s.equals("Bye.....") == true){
                System.exit(1);
            }
            ps.println(s);
            String s1 = br2.readLine();
            System.out.println(s1);
        }
    }
}


