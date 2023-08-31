
// 1. write a program to print natural number from 100 to 200....................................

import java.util.Scanner;

public class PracticeSet_5 {
/*    public static void main(String[] args) {
        int a = 100;
        while(a<=200) {
            System.out.println(a);
            a++;
        }
    }

 */


// 2. write a program to print first n natural using while do-while..............................

/*
    public static void main(String[] args) {

        System.out.println("Enter your number:");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        do {
            System.out.println(num);
            num ++;
        }
        while (num <= 10);

    }

 */


// 3. write a program to print first n number using a for loop................................
/*
    public static void main(String[] args) {
        System.out.println("Enter Your Number:");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for (int i=0;i<=num;i++)
        {
            System.out.println(i);
        }
    }

 */

// 4. write a program to print first n natural number is reverse order.......................
/*
    public static void main(String[] args) {
        System.out.println("Enter Your Number:");
        Scanner s= new Scanner(System.in);
        int num = s.nextInt();
        for(int i=num; i>=0;i--)
        {
            System.out.println(i);
        }
    }

*/

// 5. write a program to print the following pattern.........................................
/*
    public static void main(String[] args) {
    System.out.println("Enter Your Number:");
    Scanner s= new Scanner(System.in);
    int num = s.nextInt();
     for (int i=num;i>0;i--)
     {
         for (int j = 0;j<i;j++){
             System.out.print("*");
         }
         System.out.print("\n");
     }
}

 */

// 6. write a program to sum first n even number using while loop.........................
/*
    public static void main(String[] args) {
        System.out.println("Enter Your Number:");
        Scanner s= new Scanner(System.in);
        int sum = 0;
        int num = s.nextInt();
        int a=1;
        while (a<num){
            int even = 2*a;
            a++;
            System.out.print("Even number is: ");
            System.out.println(even);
            sum = sum + even;
            System.out.print("Sum of even number is: ");
            System.out.println(sum);
        }

    }

 */

// 7. write a program to print multiplication table of a given number.....................
/*
    public static void main(String[] args) {
        System.out.println("Enter Your Number:");
        Scanner s= new Scanner(System.in);
        int num = s.nextInt();
        System.out.println("Multiplication Table::");
        for (int i=1;i<=10;i++) {;
            System.out.printf("\n%d X %d = %d", num, i, num*i);
        }
    }

 */

// 8. write a program to print multiplication table in reverse order of a given number..........
    /*
public static void main(String[] args) {
    System.out.println("Enter Your Number:");
    Scanner s= new Scanner(System.in);
    int num = s.nextInt();
    System.out.println("Multiplication Table::");
    for (int i=10;i>=1;i--) {;
        System.out.printf("\n%d X %d = %d", num, i, num*i);
    }
}

 */

// 9. write a program to find factorial of a given number using for loop...........................
/*
    public static void main(String[] args) {
    System.out.println("Enter Your Number:");
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int factorial=1;
    for (int i = 1; i <= num; i++) {
         factorial *= i;
    }
    System.out.println("The factorial of "+num+" is "+factorial);
}

 */

//
public static void main(String[] args) {
    System.out.println("Enter Your Number:");
    Scanner s= new Scanner(System.in);
    int num = s.nextInt();
    int sum = 0;
    System.out.println("Multiplication Table::");
    for (int i=1;i<=10;i++) {;
        System.out.printf("\n%d X %d = %d", num, i, num*i);
        sum = sum + (num*i);
    }
    System.out.println("\nSum of product is:");
    System.out.println(sum);

}
}
