import java.net.*;
import java.util.*;


public class Networking_Java_2 {
    public static void main(String[] args) {
        URL u = null;
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter any Url: ");
        String st = s.nextLine();

        try{
            u = new URL(st);
            System.out.println("Protocol is "+u.getProtocol());
            System.out.println("Port is "+u.getPort());
            System.out.println("Path is "+u.getPath());
            System.out.println("File is "+u.getFile());
            System.out.println("Host is "+u.getHost());
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
