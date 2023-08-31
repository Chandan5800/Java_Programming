
// Thread using By extending thread class.....................................

//class MyThread1 extends Thread{
//    public void run(){
//        int i=0;
//        while (i<100) {
//            System.out.println("My thread1 is running ...........");
//            System.out.println("That's why i am happy!!");
//            i++;
//        }
//    }
//}
//
//class MyThread2 extends Thread{
//    public void run(){
//        int i=0;
//        while (i<100) {
//            System.out.println("My thread2 is running good...........");
//            System.out.println("That's why i am double happy!!");
//            i++;
//        }
//    }
//}
//public class Ch_13_ThreadClass {
//    public static void main(String[] args) {
//        MyThread1 T1 = new MyThread1();
//        MyThread2 T2 = new MyThread2();
//        T1.start();
//        T2.start();
//
//    }
//
//}



// Thread using By Implementing Runnable Interface.....................................

class MyThreadRunnable1 implements Runnable{

    @Override
    public void run() {
        int i = 0;
        while (i<100) {
            System.out.println("I am runnable thread1");
            i++;
        }
    }
}

class MyThreadRunnable implements Runnable{

    @Override
    public void run() {
        int i = 0;
        while (i<100) {
            System.out.println("I am runnable thread2 is good..............");
            i++;
        }
    }
}
public class Ch_13_ThreadClass {
    public static void main(String[] args) {
        MyThreadRunnable mt = new MyThreadRunnable();
        Thread gun = new Thread(mt);
        MyThreadRunnable1 mt1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(mt1);
        gun.start();
        gun1.start();
    }
}
