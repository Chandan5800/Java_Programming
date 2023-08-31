class thread1 implements Runnable {
    @Override
    public void run() {
        System.out.println("I am in thread1");
    }
}
    public class thread {
        public static void main(String[] args) {
            thread1 t1 = new thread1();
            Thread t = new Thread(t1);
            t.start();
        }
    }

