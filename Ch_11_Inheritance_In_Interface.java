
interface mySample{
    void method1();
    void method2();
}

interface mySampleClass extends mySample{
    void method3();
    void method4();
}

class newmySampleClass implements mySampleClass{
    @Override
    public void method1() {
        System.out.println("I am Method 1.........");
    } public void method2() {
        System.out.println("I am Method 2.........");
    } public void method3() {
        System.out.println("I am Method 3.........");
    } public void method4() {
        System.out.println("I am Method 4.........");
    }
}
public class Ch_11_Inheritance_In_Interface {
    public static void main(String[] args) {

        newmySampleClass ns = new newmySampleClass();
        ns.method1();
        ns.method3();
    }
}
