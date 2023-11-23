package craftableItems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    Item item;

    @BeforeEach
    public void setUpItem(){
        item = new Item();
    }

    @Test
    public void mustNotCraft(){
        item.setState(NoIngredients.getInstance());
        assertFalse(item.craft());
    }

    @Test
    public void mustGetIngredients(){
        item.setState(NoIngredients.getInstance());
        assertTrue(item.getIngredients());
    }

    @Test
    public void mustCraft(){
        item.setState(NoIngredients.getInstance());
        item.getIngredients();
        assertTrue(item.craft());
    }

    @Test
    public void mustNotGetIngredients(){
        item.setState(NoIngredients.getInstance());
        item.getIngredients();
        assertFalse(item.getIngredients());
    }

    @Test
    public void mustDoNothing(){
        item.setState(NoIngredients.getInstance());
        item.getIngredients();
        item.craft();
        assertFalse(item.getIngredients());
        assertFalse(item.craft());
    }

}