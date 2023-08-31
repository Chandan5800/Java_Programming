import java.util.Scanner;

class myException1 extends Exception{
    public myException1(String msg) {
        super(msg);
    }
}
public class ExceptionHandeling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = s.nextInt();

        try{
            if (age <18){
                throw new myException1("Sorry! You are not eligible to vote ");
            }
            else
                System.out.println("You are eligible ");
        }
        catch (myException1 e){
            System.out.println(e);
        }

    }
}