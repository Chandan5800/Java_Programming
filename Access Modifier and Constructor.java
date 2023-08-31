
// 1. Create a class cylinder and use getter and setter to set its radius and height...............
// 2. calculate surface area and volume................................

import java.util.Scanner;

class cylinder{
    private float radius;
   private float height;

    public void setRadius(float r){
        radius = r;
    }
    public float getRadius(){
        return radius;
    }

    public void setHeight(float h){
        height = h;
    }
    public float getHeight(){
        return height;
    }
    // problem no. 2.................................
    public double surfaceArea(){
        return (2*3.14*radius*height)+(2*3.14*radius*radius);
    }
    public double Volume(){
        return  3.14*radius*radius*height;
    }

    // problem no. 3..........................Using Constructor.............

    public cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }
}

public class PracticeSet_9 {
    public static void main(String[] args) {

// problem no. 1........................
/*
        System.out.println("Enter Radius of cylinder:");
        Scanner s = new Scanner(System.in);
        float R = s.nextFloat();
        System.out.println("Enter Height of cylinder:");
        Scanner t = new Scanner(System.in);
        float H = t.nextFloat();

        cylinder C = new cylinder();
        C.setRadius(R);
        C.setHeight(H);
        System.out.println("Radius of cylinder is :"+C.getRadius());
        System.out.println("Height of cylinder is :"+C.getHeight());

// problem no. 2......................
        C.surfaceArea();
        C.Volume();

        System.out.println("Surface Area of cylinder is :"+C.surfaceArea());
        System.out.println("Volume of cylinder is :"+C.Volume());

 */

        // problem no. 3.....................
        cylinder mycylinder = new cylinder(12,15);
        System.out.println("Surface Area of cylinder is :"+mycylinder.surfaceArea());
        System.out.println("Volume of cylinder is :"+mycylinder.Volume());

    }




}
