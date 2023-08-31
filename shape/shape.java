
package com.chandanCode.shape;

public class shape{
   
        int dim1, dim2;
        shape(int dim1 , int dim2){
            this.dim1 = dim1;
            this.dim2 = dim2;

        }
        public int getDim1(){
            return this.dim1;
        }
        public int getDim2(){
            return this.dim2;
        }

        public void setDim1(int dim1){
             this.dim1 = dim1;
        }
        public void setDim2(int dim2){
             this.dim2 = dim2;
        }
    
        public static void main(String[] args) {
            Rectangle Rc = new Rectangle(45, 50);
            System.out.println("Area of Rectangle is :"+Rc.area());

            Sphare sp = new Sphare(85);
            System.out.println("Area of Sphare is :"+sp.area());

            Square sq = new Square(42);
            System.out.println("Area of Square is :"+sq.area());

            Circle c = new Circle(20);
            System.out.println("Area of circle is :"+ c.area());

            Cylinder cy = new Cylinder(10, 45);
            System.out.println("Area of Cylinder is : "+cy.area());
            
            }
}