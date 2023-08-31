import java.util.Scanner;

public class Ch_14_Try_and_Catch {
    public static void main(String[] args) {
//        int a = 54644;
//        //int b = 654;
//        int c = 0;
//        // int d = a/b;
//         int e = a/c;
//       // System.out.println("Division result is : "+d);
//        try{
//            e = a/c;
//            System.out.println("Result is : "+e);
//        }
//        catch (Exception ex){
//            System.out.println("I am faild to calculate this result::"+ex);
//        }



       // SEcond Example *******************************************************************


        int [] marks  = new int[5];
        marks[0] = 45;
        marks[1] = 55;
        marks[2] = 89;
        marks[3] = 90;
        marks[4] = 95;

        Scanner s = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("Enter the array index:");
            int ind = s.nextInt();

//
//        System.out.println("Enter array index which is divide the value with:");
//        int num = s.nextInt();
//        try{
//            System.out.println("The value at array index entered is:"+marks[ind]);
//            System.out.println("The value at array index entered is:"+marks[ind]/num);
//
//        }
//        catch (Exception e ){
//            System.out.println("Some exception occured!!!");
//        }


// Nested Try And Catch ************************************************************************
//        try{
//            System.out.println("Welcome Sir!!!!");
//            try{
//                System.out.println(marks[ind]);
//            }
//            catch (ArrayIndexOutOfBoundsException e ){
//                System.out.println("Sorry this index is not valid for this program !!!");
//            }
//        } catch (Exception e) {
//            System.out.println("Excaption Level 1 !!!");
//        }


// QuickQuiz :- write a java  program that allows you to keep accessing an array until a valid index is given by the user..................

            try {
                System.out.println("Welcome Sir!!!!");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index is not valid for this program !!!");
                }
            } catch (Exception e) {
                System.out.println("Excaption Level 1 !!!");
            }
            System.out.println("Thanks for using this program!!!!!!");
        }


    }
}
