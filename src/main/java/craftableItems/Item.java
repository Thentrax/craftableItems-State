package craftableItems;

public class Item {
    private String name;
    private ItemState state;

    public Item(){
        this.state = NoIngredients.getInstance();
    }
    public void setState(ItemState state){
        this.state = state;
    }
    public boolean getIngredients(){
        return state.getIngredients(this);
    }
    public boolean craft(){
        return state.craft(this);
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
