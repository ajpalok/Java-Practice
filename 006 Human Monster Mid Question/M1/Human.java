package M1;
public class Human{
    private int id;
    String intelligence;
    public boolean bravery;

    public int id(){
        return id;
    }

    public Human(int id, String intelligence, boolean bravery){
        this.id = id;
        this.intelligence = intelligence;
        this.bravery = bravery;
        System.out.println("To avoid getting scared or eaten be brave or intelligent.");
    }
}