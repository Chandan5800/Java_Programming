
// 1. write a program to print good morning and welcome continuously on the screen in java using thread.................

// 2. Add a sleep method in welcome thread of question 1 to delay its execution for 200ms...............................

// 3. Demonstration getpriority() and setpriority() methods in java Thread..............................................

// 4. How do you get state of a given thread in java............................................


class MyThread1 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i<100) {
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            System.out.println("Good Morning Chandan........");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        int i = 0;

        while (i<100) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Welcome Chandan!!!!!!!!!!!!!!");
            i++;
        }
    }
}
public class PracticeSet_13 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

       // t1.start();
        //t2.start();

        t1.setPriority(6);
        t2.setPriority(9);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());


        System.out.println(t1.getState());
        System.out.println(t2.getState());

        System.out.println(Thread.currentThread().getState());

    }
}
