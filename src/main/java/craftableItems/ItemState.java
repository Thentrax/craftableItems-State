package craftableItems;

public abstract class ItemState {
    public abstract  String getState();
    public boolean getIngredients(Item item){
        return false;
    }
    public boolean craft(Item item){
        return false;
    }
}
