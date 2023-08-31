
class myEmployee1{
   private int id;
    private String name;
    public myEmployee1(){
        name = "Chandan is a good boy!!";
        id = 167;
    }
    public myEmployee1(int i,String n){
        id = i;
        name = n;

    }

    public String getName(){
        return name;
    }
    public void setName(String n){
         name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }


}

public class Ch_9_Constructor {
    public static void main(String[] args) {
        myEmployee1 chandan = new myEmployee1();
        chandan.getId();
        chandan.getName();
        System.out.println(chandan.getId());
        System.out.println(chandan.getName());

        myEmployee1 ravi = new myEmployee1(167,"Chandan Kumar Poddar");
        System.out.println(ravi.getId());
        System.out.println(ravi.getName());


    }
}
