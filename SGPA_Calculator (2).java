//Write a program to calculate CGPA using marks of subject


import java.util.Scanner;

public class Practice_1_2_Cal_CGPA {
    public static void main(String[] args) {
        System.out.println("CGPA CALCULATOR");
        Scanner a = new Scanner(System.in);

        System.out.println("Enter Your subject1 Marks");
        int subject1 = a.nextInt();
        System.out.println("Enter Your subject1 Credit");
        int c1 = a.nextInt();
        int marks1 = subject1*c1;

        System.out.println("Enter Your subject2 Marks");
        int subject2 = a.nextInt();
        System.out.println("Enter Your subject2 Credit");
        int c2 = a.nextInt();
        int marks2 = subject2*c2;

        System.out.println("Enter Your subject3 Marks");
        int subject3 = a.nextInt();
        System.out.println("Enter Your subject3 Credit");
        int c3 = a.nextInt();
        int marks3 = subject3*c3;

        System.out.println("Enter Your subject4 Marks");
        int subject4 = a.nextInt();
        System.out.println("Enter Your subject4 Credit");
        int c4 = a.nextInt();
        int marks4 = subject4*c4;

        System.out.println("Enter Your subject5 Marks");
        int subject5 = a.nextInt();
        System.out.println("Enter Your subject5 Credit");
        int c5 = a.nextInt();
        int marks5 = subject5*c5;

        System.out.println("Enter Your subject6 Marks");
        int subject6 = a.nextInt();
        System.out.println("Enter Your subject6 Credit");
        int c6 = a.nextInt();
        int marks6 = subject6*c6;

        System.out.println("Enter Your subject7 Marks");
        int subject7 = a.nextInt();
        System.out.println("Enter Your subject7 Credit");
        int c7 = a.nextInt();
        int marks7 = subject7*c7;

        int total = marks1 + marks2 + marks3 + marks4 + marks5 + marks6 + marks7;
        System.out.println("Total Marks : "+total);

        float totalcredit = c1 +c2 + c3 + c4 + c5 + c6 + c7;
        System.out.println("Total Credit : "+totalcredit);

        float cgpa = total / totalcredit;

        System.out.println("YOUR CGPA Is :");
        System.out.println(cgpa);

    }
}
