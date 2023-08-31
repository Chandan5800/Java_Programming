// 1. Create a class circle and use inheritance to create another class cylinder from it...............
// 3. create method for area and volume in problem no. 1...............................................
import java.util.Scanner;
/*
class circleNew{
    public int radius;
    public circleNew(int r) {
        this.radius = r;
        System.out.println("Radius of circle is :"+r);
    }
    public double area (){
        return 3.14 * this.radius * this.radius;
    }
}
class cylinderNew extends circleNew{
    public cylinderNew(int r, int h) {
        super(r);
        this.height = h;
        System.out.println("Radius of Cylinder is :"+r);
        System.out.println("Height of Cylinder is :"+h);
    }

    public int height;
    public double volume(){
        return 3.14 * this.radius * this.radius * this.height;
    }
}

 */

// 2. create a class rectangle and use inheritance to create another class cuboid. Try to keep it as close to real world seenerio as possible.........
// 4. create method for area and volume in problem no. 2.............................................................................................

class rectangle{
    public int length;
    public int width;

    public rectangle(int l, int w) {
        this.length = l;
        this.width = w;
        System.out.println("Length of rectangle is:"+l);
        System.out.println("Width of rectangle is:"+w);

    }

    public int getLength() {
        return length;
    }

    public void setLength(int l) {
        this.length = l;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int w) {
        this.width = w;
    }

    public double area(){
        return length * width;
    }
}

class cuboid extends rectangle{
    public int height;

    public cuboid(int l, int w, int h) {
        super(l, w);
        this.height = h;
        System.out.println("Length of cuboid is:"+l);
        System.out.println("Width of cuboid is:"+w);
        System.out.println("Height of cuboid is:"+h);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    public double volume(){
        return length * width * height;
    }
}

public class PracticeSet_10 {
    public static void main(String[] args) {

        // problem mo. 1 and 3..................................................................

//        System.out.println("Enter radius of circle:");
//        Scanner s = new Scanner(System.in);
//        int r = s.nextInt();
////        circleNew c = new circleNew(r);
////        System.out.println("Area of circle is = "+c.area());
//
//        System.out.println("Enter height of Cylinder:");
//        Scanner t = new Scanner(System.in);
//        int h = s.nextInt();
//        cylinderNew C = new cylinderNew(r, h);
//        System.out.println("Volume of Cylinder is : "+C.volume());
//        System.out.println("Area of Circle is : "+C.area());

        // problem no. 2 and 4...................................................................

        System.out.println("Enter length of the Rectangle:");
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        System.out.println("Enter Width of the Rectangle:");
        Scanner t = new Scanner(System.in);
        int w = s.nextInt();
        System.out.println("Enter Height of the cuboid:");
        Scanner u = new Scanner(System.in);
        int h = u.nextInt();
        rectangle r = new rectangle(l,w);
        r.setLength(l);
        r.setWidth(w);
//        System.out.println("Area of Rectangle is : "+r.area());


        cuboid cu = new cuboid(l,w,h);
        cu.setHeight(h);
        System.out.println("Area of rectangle is :"+r.area());
        System.out.println("Volume of cuboid is : "+cu.volume());


//        rectangle rc = new cuboid(l,w,h);
//        System.out.println(rc.getLength());
//        System.out.println(rc.getWidth());
//        System.out.println(rc.getHight());

    }
}
