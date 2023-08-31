// 1. write will be the output of this program............................

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class PracticeSet_4 {

    /*
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Enter Your Number:");
        Scanner n = new Scanner(System.in);
        int  name = n.nextInt();
        if(a>name)
            System.out.println("I am 11 Years old");
            else
                System.out.println("I am not 11 Years old");

    }
    */

/*
    public static void main(String[] args) {
        System.out.println("Enter First subject marks: ");
        Scanner n = new Scanner (System.in);
        int num = n.nextInt();
        System.out.println("Enter Second subject marks: ");
        int num1 = n.nextInt();
        System.out.println("Enter Third subject marks: ");
        int num2 = n.nextInt();
        System.out.println("Your Total Marks is ::");
        float total = num+num1+num2;
        System.out.println(total);
        System.out.println("Your Percentage is::");
        float pr = (total/300)*100;
        System.out.println(pr);
        // Condition start...............
        if (pr >= 90 )
            System.out.println("You are topper in Exam!!👍");
        else if (pr >= 80) {
            System.out.println("Your are good student!!👌");
        }
        else if (pr >= 70) {
            System.out.println("You are average student!!");
        }
        else if (pr >= 60) {
            System.out.println("You are below average student!!🙌");
        }
        else if (pr >= 33) {
            System.out.println("You are pass the exam!!");
        }
        else
            System.out.println("You are fail in exam!!!😒");

    }


 */



    // 3. w.a.p. to find whether a year entered by the user is a leap year or not..............

   /* public static void main(String[] args) {
        System.out.println("Enter your Year::");
        Scanner yr = new Scanner(System.in);
        int year = yr.nextInt();
        if (year % 4 == 0)
            System.out.println("Your year is leap year!!");
        else
            System.out.println("Your year is not leap year");
    }*/



    // 4. find the day of week given the number .....................
   /*
    public static void main(String[] args) {
        System.out.println("Enter Your Number:");
        Scanner y = new Scanner(System.in);
        int num = y.nextInt();

        if (num == 1)
            System.out.println("Monday");
        else if (num == 2)
        {
            System.out.println("Tuesday");
        }
        else if (num == 3)
        {
            System.out.println("Wednesday");
        }
        else if (num == 4)
        {
            System.out.println("Thursday");
        }
        else if (num == 5)
        {
            System.out.println("Friday");
        }
        else if (num == 6)
        {
            System.out.println("Saturday😊");
        }
        else if (num == 7)
        {
            System.out.println("Sunday😍");
        }
    }

    */



    // Using switch case.....................
/*
    public static void main(String[] args) {
        System.out.println("Enter your num:");
        Scanner d= new Scanner(System.in);
        int day = d.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

    }*/



    // write a program to find out the type of website from the url...................

    public static void main(String[] args) {
        System.out.println("Enter you website name:");
        Scanner web = new Scanner(System.in);
        String website = web.next();
        if(website.endsWith(".com"))
        System.out.println("Your website is commericial.");
        else if(website.endsWith(".org"))
        System.out.println("Your website is organization.");
        else if(website.endsWith(".in"))
        System.out.println("Your website is indian.");

    }
}

