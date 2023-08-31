// Taking input From user.......

import java.util.Scanner;

public class Chapter_1_Input_Program {
    public static void main(String[] args) {
        System.out.println("Addition Multiplication of two numbers:: ");
        Scanner s = new Scanner (System.in);
        System.out.println("Enter Your First Number:");
        int a = s.nextInt();
        System.out.println("Enter Your Second Number:");
        int b = s.nextInt();
        int Product = a*b;
        System.out.println("Product of two number is : ");
        System.out.println(Product);


    }

}
