import java.util.*;
import java.time.*;

public class Date_Time {
    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getYear()+1900);
        System.out.println(d.getDay());
        System.out.println(d.getSeconds());

    }
}
