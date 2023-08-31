
// 1. create a class employee with following properties and methods...............
// problem no. 1 class..............
/*class employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
    return name;
    }
    public void setName(String n){
        name = n;
    }
}

//problem no. 2 class......................
class cellphone{
    public void ringing(){
        System.out.println("Your phone is ringing.....");
    }
    public void vibrating(){
        System.out.println("Your phone is vibrating.....");
    }
}

 */

import java.util.Scanner;

// problem no. 3 class........................
/*
class square{
    int side;
    public float area(){
        return side * side;
    }
    public float perimeter(){
        return side*4;
    }
}

 */

// problem no. 4 class......................
/*
class rectangle{
    float length;
    float width;
    public float area(){
        return length*width;
    }
    public float perimeter(){
        return 2*(length+width);
    }
}

 */

// problem no. 6 class.................
class circle{
    float radius;
    public double area(){
        return 3.14*(radius*radius);
    }
    public double perimeter(){
        return 2*3.14*radius;
    }
}
public class PracticeSet_8 {
    public static void main(String[] args) {

        // Problem no. 1..........
     /*   employee1 chandan = new employee1();
        chandan.setName("Chandan Kumar");
        chandan.salary= 1500;
        chandan.getName();
        System.out.println(chandan.getName());
        System.out.println(chandan.getSalary());

        // Problem no. 2..........

        cellphone samsung = new cellphone();
        samsung.ringing();
        samsung.vibrating();

      */

        // problem no. 3.........
/*
        System.out.println("Enter your side::");
        Scanner s = new Scanner(System.in);
        int sd = s.nextInt();
        square sq = new square();
        sq.side=sd;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

 */

        // problem no. 4.............
/*
        System.out.println("Enter Length of rectangle:");
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        System.out.println("Enter width of rectangle:");
        Scanner t = new Scanner(System.in);
        int w = s.nextInt();

        rectangle rq = new rectangle();
        rq.length=l;
        rq.width=w;

        System.out.println(rq.area());
        System.out.println(rq.perimeter());

 */

        // problem no. 6..............

        System.out.println("Enter radius of circle:");
        Scanner s = new Scanner(System.in);
        float r = s.nextFloat();
        circle c = new circle();
        c.radius = r;
        System.out.println("Area of circle is : "+c.area());
        System.out.println("Perimeter of circle is : "+c.perimeter());

    }
}
