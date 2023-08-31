
interface Bicycle{
    void applyBreak(int decrement);
    void speedUp (int increment);
}

interface Bike{
    void applyHorn();
    void blowHorn ();
}

class AvonCycle implements Bicycle, Bike{
    int a= 45;
    public void blowHorn1(){
        System.out.println("pee pee pee pee!!!!..........");
    }
    public void applyBreak(int decrement){
        System.out.println("Applying Break..........");
    }
    @Override
    public void speedUp(int increment) {
        System.out.println("Applying SpeedUp.........");
    }

    public void applyHorn(){
        System.out.println("Tii tii peee pooo.............");
    }
    public void blowHorn(){
        System.out.println("Poo poo poo poo poo...........");
    }
}

public class Ch_11_Interface {
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBreak(5);
        System.out.println(cycle.a);

        cycle.blowHorn();
        cycle.applyHorn();



    }

}
