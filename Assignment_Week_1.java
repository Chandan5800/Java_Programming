//class Add{
//    public void sum(){
//        int a = 5,b=7;
//        System.out.println(a+b);
//    }
//}

//class Temperature{
//    public void convert(int c){
//        float f = (c * 9/5)+32;
//        System.out.println("Temperature In F = "+f);
//    }
//    public void convert(float f){
//        float c = (f -32)*5/9;
//        System.out.println("Temperature In c = "+c);
//    }
//}


//class number{
//    public void disp(int a){
//        if (a%2==0){
//            System.out.println("Even Number");
//        }
//        else
//            System.out.println("Odd number");
//    }
//}

//class number1{
//    public void disp(int a){
//        if (a>0){
//            System.out.println("Positive Number");
//        }
//        else
//            System.out.println("Negitive number");
//    }
//}

//class number2{
//    public void swap(int a, int b){
//        System.out.println("Before swaping a="+a +"y="+b);
//        int c = a;
//        a = b;
//        b = c;
//        System.out.println("After swaping a="+a +"y="+b);
//    }
//}


//class year{
//    public void leap(int a){
//        if(a%4==0){
//            if (a%100==0){
//                if (a%400==0){
//                    System.out.println("Leap Year");
//                }
//                else
//                    System.out.println("Not leap year");
//            }
//        }
//
//    }
//}


//class number3{
//    public void max(int a, int b, int c){
//        if (a>b || a>c){
//            System.out.println("Maximum is a = "+a);
//        }
//        else if (b>a || b>c)
//        {
//            System.out.println("Maximum is b = "+b);
//        }
//        else if (c>a || c>b)
//        {
//            System.out.println("Maximum is c = "+c);
//        }
//        else
//            System.out.println("All three are equal");
//    }
//}


//class marks{
//    public void grade(int a, int b, int c, int d){
//        int sum = a+b+c+d;
//        int precnt = (sum/400)*100;
//        if (precnt >= 90 && precnt <=100){
//            System.out.println("Grade A");
//        }
//        else if (precnt >= 80  && precnt <90)
//        {
//            System.out.println("Grade B");
//        }
//        else if (precnt >= 70 && precnt <80)
//        {
//            System.out.println("Grade C");
//        }
//        else if (precnt >= 60 && precnt <70)
//        {
//            System.out.println("Grade D");
//        }
//        else if (precnt >= 40 && precnt <60)
//        {
//            System.out.println("Grade E");
//        }
//
//    }
//}
//public class Assignment_Week_1 {
//    public static void main(String[] args) {
////        Add a = new Add();
////        a.sum();
//
////        Temperature t = new Temperature();
////        t.convert(25);
////        t.convert(96.0F);
//
////        number n = new number();
////        n.disp(5);
////        n.disp(10);
//
////        number1 n1 = new number1();
////        n1 . disp(6);
////        n1 . disp(-6);
//
////        number2 n2 =new number2();
////        n2.swap(45,89);
////
////        year y = new year();
////        y.leap();
//
////        number3 n3 = new number3();
////        n3.max(45,85,65);
////        n3.max(45,45,45);
//
//        marks m = new marks();
//        m.grade(50,80,75,84);
//
//    }
//}

import package1.*;
class class3{
    public void method3(){
        System.out.println("I am in class-3");
    }
}
public class Assignment_Week_1 {
    public static void main(String[] args) {
        class3 c3 = new class3();
        c3.method3();

    }
}