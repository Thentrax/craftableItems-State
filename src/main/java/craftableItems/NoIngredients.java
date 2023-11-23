package craftableItems;

public class NoIngredients  extends ItemState{
    private NoIngredients() {};
    private static NoIngredients instance = new NoIngredients();
    public static NoIngredients getInstance(){
        return instance;
    }
    public String getState(){
        return "Sem os ingredientes";
    }

    public boolean getIngredients(Item item){
        item.setState(HasIngredients.getInstance());
        return true;
    }
}
