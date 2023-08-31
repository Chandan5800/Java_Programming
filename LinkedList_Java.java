import java.util.LinkedList;

public class LinkedList_Java {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(4,90);
        l1.add(1,100);

        l2.add(100);
        l2.add(200);
        l2.add(300);
        l2.add(400);
        l2.add(500);

        l1.addFirst(1000);
        l1.addLast(2000);

        l1.addAll(l2);
        for (int i=0 ; i< l1.size();i++){
            System.out.print(", "+l1.get(i));
        }
//
//        System.out.println(l1.contains(90));
//        System.out.println(l1.contains(80));
//        System.out.println(l1.isEmpty());
//        l1.set(4,500);
//        for (int i=0 ; i< l1.size();i++){
//            System.out.println(l1.get(i));
//        }

    }
}
