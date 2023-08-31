import java.util.Scanner;

class booking implements Runnable{
    int request;
    int available = 5;
    booking(int x){
        request = x;
    }

    public void run(){
        synchronized (this){
            System.out.println("Available Ticket is : "+available);

            if (request <= available) {
                System.out.println(request + " Ticket is Booked for:" + Thread.currentThread().getName());

                available = available - request;
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
                else
                System.out.println("Sorry! No Ticket Available");
        }
    }
}
public class Ticket_Booking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Ticket Number:");

        int x = sc.nextInt();

        booking b1 = new booking(x);
        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(b1);

        t1.setName("Chandan");
        t2.setName("Aditya");

        t1.start();
        t2.start();

    }
}
