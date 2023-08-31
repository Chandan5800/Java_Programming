// Access modifier using private....................................

class myEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }
}

public class Ch_9_Access_Modifier_Private {
    public static void main(String[] args) {
        myEmployee chandan = new myEmployee();
        chandan.setId(167);
        chandan.setName("Chandan Kumar Poddar");
        System.out.println(chandan.getId());
        System.out.println(chandan.getName());


    }

}
