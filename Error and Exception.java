
// 1. write a java program to demonstrate syntex, logical and rutime error..........

import java.util.Scanner;

// 2. w.a.j.p that print haha during arthimetic exception and hehe duriing illegal exception......


// 4. ........................



public class PracticeSet_14 {
        public static void maxRetries(int ind) throws ArithmeticException{

                System.out.println("Error......");

        }
    public static void main(String[] args) {

        //problem 1..................................................
        // int a = 7  syntex error.......

//        int age = 20;
//        int year_born = 2000 - 20;  // Logical error
//
//        System.out.println(8/0);

        // Problem 2...................................................
//        try{
//            int a= 8784/0;
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("HaHaHaHa...........");
//        }
//        catch (ArithmeticException e){
//            System.out.println("HeHeHeHeHe//////////////");
//        }


        // Problem 3....................................................

        int [] marks  = new int[5];
        marks[0] = 45;
        marks[1] = 55;
        marks[2] = 89;
        marks[3] = 90;
        marks[4] = 95;
        Scanner s = new Scanner(System.in);
        boolean flag = true;
        int i = 0;

        while(flag && i<5) {
            System.out.println("Enter the array index:");
            try {
                int ind = s.nextInt();
                System.out.println("The value of marks of your index is : " + marks[ind]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid Index !!!!!");
                i++;

            }
            if (i>5){
                maxRetries( i);
//           System.out.println("Error............");
//           throw new ArithmeticException("Error.......");
            }
        }


        // Problem 4.........................................................................



    }
}
