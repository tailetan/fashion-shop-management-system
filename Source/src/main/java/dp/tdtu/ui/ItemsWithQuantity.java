package dp.tdtu.ui;

import dp.tdtu.model.Item;


public class ItemsWithQuantity{
    private int quatity;
    private Item item;

    public ItemsWithQuantity(int quatity, Item item) {
        this.quatity = quatity;
        this.item = item;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
  
}
