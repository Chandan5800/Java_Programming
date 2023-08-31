// 1. write a program to calculate factorial of a number in java using recursion...............

import java.sql.SQLOutput;
import java.util.Scanner;

public class PracticeSet_7 {
/*
    static int factorial(int a){
        if (a==0 || a==1){
            return 1;
        }
        else
            return (a * factorial(a-1));
    }

    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int result = factorial( a);
        System.out.println("Factorial of "+a+" is "+result);
    }

 */

// 2. write a java program to print multiplication table of a number..........................
/*
    static int multiplication(int x){
        for (int i = 1; i<=10; i++){
            int product = x * i;
            System.out.println(x+" X "+i+" = "+product);

        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("::Multiplication Table::");
        System.out.println("Enter Your Number :");
        Scanner s= new Scanner(System.in);
        int a = s.nextInt();
        int result = multiplication(a);
        //System.out.println(a+" X "+i+" = "+result);
    }

 */


// 3. write a program to print the following pattern,,,,,,,,,,,,,,,,,,...........................
/*
    static int pattern(int x){
        for (int i=x;i>0;i--)
        {
            for (int j = 0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Enter your number:");
        Scanner s=new Scanner(System.in);
        int a = s.nextInt();
        int result =  pattern(a);
}

 */

// 4. write a recursive function to calculate the sum of first n natural number.....................

    static int natural(int a){
        if(a != 0){
            return a + natural(a -1);
        }
        else {
            return a;
        }
    }
    public static void main(String[] args) {
//        System.out.println("Enter Your Number:");
//        Scanner s= new Scanner(System.in);
//        int x = s.nextInt();
        int x = 10;
        int result = natural(x);
        System.out.println(result);

    }



// 5. write a function to print nth term of fabanacci series using recursion..............
/*
    static int fabonacci(int a){
        int t1=0;
        int t2=1;
        int nxt=t1+t2;
        for (int i=0;i<=a;i++){
            t1=t2;
            t2=nxt;
            nxt=t1+t2;
            System.out.printf("%d ",nxt);
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("Enter your number:");
        Scanner s= new Scanner(System.in);
        int x = s.nextInt();
        int result = fabonacci(x);
    }

 */

// 6. write a function to find average of a set of number passed as argument.....................
/*
    static int averager(int a, int b, int c){
       int result = (a + b + c)/3;
        System.out.println("Average of given number is = "+result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter your three input:");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        Scanner t = new Scanner(System.in);
        int y = t.nextInt();
        Scanner u = new Scanner(System.in);
        int z = u.nextInt();

        int g = averager(x,y,z);

    }

 */

// 9. write a function to convert celsius temprature into farhenhite.....................
/*
    static float temperature(float x){
        float result = (x*9/5)+32;
        System.out.println("Temperature in Fahrenheit: "+result);
        return 0;

    }
    public static void main(String[] args) {
        System.out.println("Enter Temperature in Celsius:");
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();

        float y = temperature(a);
    }

 */

//  10. write a program to calculate sum of n natural number using itrative approch..............
/*
    static int natural(int a){
        int sum =0;
        for (int i = 1; i<=a;i++){
            sum = sum + i;
        }
        System.out.println("Sum of Nth natural number: "+sum);
        return sum;
    }
    public static void main(String[] args) {
//        System.out.println("Enter Your Number:");
//        Scanner s= new Scanner(System.in);
//        int x = s.nextInt();
        int x = 10;
        int result = natural(x);
    }

 */

}
