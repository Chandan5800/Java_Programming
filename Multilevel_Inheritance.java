

class myClass1{
    public void method1(){
        System.out.println("I am the method of class1");
    }
}
interface myInterface{
    public void methodInInterface();
}


 class myClass2 extends myClass1 implements myInterface{
    public void method2(){
        System.out.println("I am the method of class2");
    }

     @Override
     public void methodInInterface() {
         System.out.println("I am the method of interface");
     }
 }

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        myClass2 cl2  = new myClass2();
        cl2.method1();
        cl2.method2();
        cl2.methodInInterface();
    }
}
