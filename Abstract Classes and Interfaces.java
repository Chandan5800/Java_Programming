// 1.  create an abstract class pen with method write and refill as abstract method............
// 2. use to pen class from q1 to create a concreate class fountainpen with additional method change nib....
//abstract class pen{
//        abstract void write();
//        abstract void refill();
//        }
//
//class fountainPen extends pen{
//    void write(){
//        System.out.println("I am writting.........");
//    }
//    void refill(){
//        System.out.println("I am refilling.........");
//    }
//    void changeNib(){
//        System.out.println("I am changing the Nib........");
//    }
//}


// 3. create a class monkey with jump and bit method create a class human which inherits this monkey class and implements basicanimal interface with eat and sleep method...........

//class monkey{
//    void jump(){
//        System.out.println("I am monkey so, i am jumping.............");
//    }
//    void bite(){
//        System.out.println("I am monkey. That's why i bite human.........");
//    }
//}
//
//interface basicAnimal{
//        void eat();
//        void sleep();
//}
//class human extends monkey implements basicAnimal{
//    void speak(){
//        System.out.println("I am monkey. wek wek wek wek...................");
//    }
//
//    @Override
//    public void eat() {
//        System.out.println("Now i am eating ...........");
//    }
//
//    @Override
//    public void sleep() {
//        System.out.println("Now i am sleeping............");
//    }
//}


// 6. create an interface tvremote and use it to inherat another interface smarttvremote...........

interface tvRemote{
    void onTv();
    void  offTv();
}

interface smartTvRemote extends tvRemote{
    void openTv();
    void closedTv();
}

class tv implements smartTvRemote{
    @Override
    public void onTv() {
        System.out.println("I on the tv............");
    }

    @Override
    public void offTv() {
        System.out.println("I off the tv..........");
    }
    public void openTv() {
        System.out.println("I Open the tv..........");
    }
    public void closedTv() {
        System.out.println("I closed the tv..........");
    }
}

public class PracticeSet_11 {
    public static void main(String[] args) {
//        fountainPen fp = new fountainPen();
//        fp.refill();
//        fp.changeNib();
//        fp.write();

// problem - 3................................................

//        human h = new human();
//        h.eat();
//        h.sleep();
//        h.speak();
//        h.bite();
//        h.jump();

// problem - 6................................................

        tv t = new tv();
        t.closedTv();
        t.onTv();
        t.openTv();
        t.offTv();
    }
}
