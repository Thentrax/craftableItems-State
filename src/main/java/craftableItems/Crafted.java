package craftableItems;

public class Crafted extends ItemState{
    private Crafted() {};
    private static Crafted instance = new Crafted();
    public static Crafted getInstance(){
        return instance;
    }
    public String getState(){
        return "Item já criado";
    }
}
