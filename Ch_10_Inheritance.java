
// 1. Create a class animal and derive another class dog from it..................

class animal{
    public String cat(){
        return "Cat sound is meewoo!!";
    }
}
class dog extends animal{
    public String dog(){
        return "Dog sound is bhawo bhawo!!";
    }
}
public class Ch_10_Inheritance {
    public static void main(String[] args) {

        // In this(animal) object only cat class is present that's why only cat will exicute.........
//        animal a = new animal();
//        a.cat();
//        a.dog();
//        System.out.println(a.cat());
//        System.out.println(a.dog());

        // But In this(dog) object cat class is also exicuted because of inheritance using extends keywords........
        dog d  = new dog();
        d.dog();
        d.cat();
        System.out.println(d.cat());
        System.out.println(d.dog());


    }
}
