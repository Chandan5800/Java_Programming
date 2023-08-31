import java.net.*;
import java.util.*;


public class Networking_Java_1 {
    public static void main(String[] args) throws UnknownHostException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Website name: ");
        String s = sc.nextLine();

        InetAddress i = InetAddress.getByName(s);
        System.out.println("IP Address of "+s+" is "+i);

    }
}
