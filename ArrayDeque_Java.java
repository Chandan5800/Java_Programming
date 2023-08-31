import java.util.ArrayDeque;

public class ArrayDeque_Java {
    public static void main(String[] args) {
        ArrayDeque<Integer> d1 = new ArrayDeque<>();

        d1.add(45);
        d1.add(55);
        d1.add(60);
        d1.add(20);
        d1.add(40);

        System.out.println(d1.getFirst());
        System.out.println(d1.getLast());
        System.out.println(d1.clone());

        d1.addFirst(500);
        d1.addLast(1000);

        d1.remove(20);
        System.out.println(d1.getFirst());
        System.out.println(d1.getLast());
        System.out.println(d1.clone());



    }
}
