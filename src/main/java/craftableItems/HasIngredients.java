package craftableItems;

public class HasIngredients extends ItemState{
    private HasIngredients() {};
    private static HasIngredients instance = new HasIngredients();
    public static HasIngredients getInstance(){
        return instance;
    }
    public String getState(){
        return "Pronto para criar";
    }

    public boolean craft(Item item){
        item.setState(Crafted.getInstance());
        return true;
    }
}
