
// 1. Write a program to convert a string to lowercase..............

public class PracticeSet_3 {


    /*
    public static void main(String[] args) {

        System.out.println("Converted into Lowercase:");
        String name = "My NAME IS CHANDAN KUMAR AND I AM FROM DARBHANGA, BIHAR";
        System.out.println(name.toLowerCase());


        System.out.println("Converted into Uppercase:");
        String name1 = "my name is chandan kumar and i am from darbhanga, bihar";
        System.out.println(name.toUpperCase());
    }
*/



// 2. write a program to replace space with underscore...................................
/*
    public static void main(String[] args) {
        String name = "My NAME IS CHANDAN KUMAR AND I AM FROM DARBHANGA, BIHAR";
        System.out.println("Replacement space with underscore" );
        System.out.println(name.replace(' ','_'));
    }
*/


    // 3. .....................................................................................

/*
    public static void main(String[] args) {
        String  name = "Dear name Thanks a lot!!";
        System.out.println("Before replacing::");
        System.out.println(name);
        System.out.println("After replacing::");
        System.out.println(name.replace("name","Chandan"));
*/

// 4. write a program to detect double and triple space in a strings.......................................

/*
    public static void main(String[] args) {
        String st = "What are you doing  main    .Why  are you   hare     .just go back  your home.";

        System.out.println(st);
        System.out.println(st.indexOf("  "));
        System.out.println(st.indexOf("   "));

    }
*/



// 5. write a program to format the following letter using escape sequence character.


    public static void main(String[] args) {
        String letter = "Dear Chandan, \n\tYour project is nice. \n\tThanks!";

        System.out.println(letter);

    }



}








