package PackagePractice;
import PackageProgram.*;

 class c3{
    public void method3(){
        System.out.println("I am in class-3");
    }
}

public class call_package {
    public static void main(String[] args) {
        c3 c = new c3();
        c2 cn = new c2();
        c1 cm = new c1();
        c.method3();
        cn.method2();
        cm.method1();
        
    }
    
}
