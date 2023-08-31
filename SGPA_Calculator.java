import java.sql.SQLOutput;
import java.util.Scanner;

public class SGPA_Calculator {
    public static void main(String[] args) {
        int n =0;
        int credit=0;
        int []arr = new int[n];
        System.out.println("Enter Number of Subject");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i<= n;i++) {
            Scanner s = new Scanner(System.in);
            System.out.println("Subject "+ i +" Marks As Per The Grade::");
            int sub = s.nextInt();
        }
        for (int i = 1; i<= n;i++) {
            Scanner s = new Scanner(System.in);
            System.out.println("Subject "+ i +" Credit::");
            int cr = s.nextInt();

            int totalcredit = credit + cr;
            System.out.println("Total Credit is = "+totalcredit);
        }
        for (int i = 1; i<= n;i++) {


        }



    }
}
