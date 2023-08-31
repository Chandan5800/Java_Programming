// Calculate percentage of a given student in cbse boar exam. His marks from 5 subject must be taken as input from the keyboard.......

import java.util.Scanner;
public class Practice_1_1 {
    public static void main(String[] args) {
        System.out.println("Enter Total Marks ");
        Scanner  s = new Scanner(System.in);
        int total = s.nextInt();

        System.out.println("Enter Subject1 Marks ");
        int subject1 = s.nextInt();

        System.out.println("Enter Subject2 Marks ");
        int subject2 = s.nextInt();

        System.out.println("Enter Subject3 Marks ");
        int subject3 = s.nextInt();

        System.out.println("Enter Subject4 Marks ");
        int subject4 = s.nextInt();

        System.out.println("Enter Subject5 Marks ");
        int subject5 = s.nextInt();

        float obtainmarks = subject1 + subject2 + subject3 + subject4 + subject5 ;

        System.out.println("Marks Obtain in Exam: ");
        System.out.println(obtainmarks);

        float percentage = (obtainmarks / total) *100;

        System.out.println("Your Percentage is :");
        System.out.println(percentage);


    }
}
