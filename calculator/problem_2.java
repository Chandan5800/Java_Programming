import java.util.Scanner;

class name{
    void greet(String n){
        System.out.println("Good Morning "+n);
    }
}
public class problem_2 {
    public static void main(String[] args) {
        System.out.println("Enter Your Name:");
        Scanner s = new Scanner(System.in);
        String n  = s.nextLine();
        //System.out.println("Good Morning "+name);

        name nm = new name();
        nm.greet(n);

    }
    
}
