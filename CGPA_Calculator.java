import java.util.Scanner;

public class CGPA_Calculator {
    public static void main(String[] args) {
        int sum =0;
        int sum1 = 0;
        double sgpa= 0;
        System.out.println("------------------------------------------------");
        System.out.println("----------------CGPA CALCULATOR-----------------");
        System.out.println("------------------------------------------------");
        System.out.println("Enter Number Of Subject You Have Taken::");
        Scanner s = new Scanner(System.in);
        int sub = s.nextInt();
        for(int i = 1; i<=sub;i++){
            System.out.println("Enter subject "+i+" marks");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println("Enter subject "+i+" credit");
            Scanner sc1 = new Scanner(System.in);
            int num1 = sc.nextInt();

            int actualmarks = num*num1;
            System.out.println("Your Subject "+i+" Actual Marks = "+actualmarks);

            sum = sum +num;
            sum1 = sum1+ num1;

            sgpa =sgpa +actualmarks;
            System.out.println("Your SGPA is = "+sgpa);

            System.out.println("Your Total Marks is = "+sum);
            System.out.println("Your total Subject Credit is = "+sum1);
        }




    }
}
