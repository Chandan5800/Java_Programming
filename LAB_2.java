// 1. W.A.P to find sum,difference, product, and division of two number by passing to the different method..............

class amOperation {
/*
    void sum(int a, int b) {
        System.out.println("The sum of two number is = " + (a + b));
    }

    void difference(int a, int b) {
        System.out.println("The difference of two number is = " + (a - b));
    }

    void product(int a, int b) {
        System.out.println("The product of two number is = " + (a * b));
    }

    void division(int a, int b) {
        System.out.println("The division of two number is = " + (a / b));
    }


 */

//---------------------------------------------------------------------------------------------------------------------

// 2. W.A.P to find the factorial of a number by passing it as a parameter in a method.................................
/*
    void factorial(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of " + x + " is " + fact);
    }


 */

//---------------------------------------------------------------------------------------------------------------------

//4. W.A.P to demonstrate the method overloading............................................................

    public void demo(int a) {
        System.out.println("Area of Circle is = " + (Math.PI * a * a));
    }

    public void demo(int a, int b) {
        System.out.println("Area of Rectangle is = " + (a * b));
    }

    public void demo(int a, int b, int c) {
        System.out.println("Product of three number is = " + (a * b * c));
    }

}
//--------------------------------------------------------------------------------------------------------------------

// 6. W.A.P to use of default and perameterised constructor...........................................................
/*
    public amOperation(){
        int a = 2;
        int b = 8;
        System.out.println("sum of two number using default constructor = "+(a+b));
    }

    public amOperation(int x, int y){
        int a;
        int b;
        System.out.println("Sum of two number using parameterised constructor = "+(x+y));
    }

 */

//--------------------------------------------------------------------------------------------------------------------

// 7. W.A.P to demonstrate constructor overloading....................................................................
/*
    public amOperation(){
        int a=45;
        int b=4168;
        System.out.println("Product of two number is = "+(a+b));
    }
    public amOperation(double r){
        double area = 4 * Math.PI * r * r;
        System.out.println("Area of sphere is = "+area);
    }
    public amOperation(String a,int b){
        System.out.println("Your name is "+a+" and your age is "+b);
    }


}

 */
public class LAB_2 {
    public static void main(String[] args) {
        amOperation a = new amOperation();
//        amOperation ao = new amOperation(12.5);
//        amOperation am = new amOperation("Chandan Kumar ",21);

        //amOperation ao = new amOperation(45,65);


//        a.sum(45,45);
//        a.difference(754,622);
//        a.product(15,78);
//        a.division(7864,56);




//        a.factorial(5);
//        a.factorial(10);





        a.demo(12);
        a.demo(45,15);
        a.demo(12,12,12);




    }
}
