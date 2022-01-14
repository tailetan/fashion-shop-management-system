
package dp.tdtu.repo;

import java.util.Map;

import dp.tdtu.model.Item;

import java.util.HashMap;

 
public class ItemRepository {
    public static Map<Integer, Item> items = new HashMap<>();
    
    static {
        items.put(1, new Item(1, "Sơ mi nam trắng", 190000));
        items.put(2, new Item(2, "Sơ mi nam xanh", 150000));
        items.put(3, new Item(3, "Quần tây nam", 80000));
        items.put(4, new Item(4, "Quần jean nam", 170000));
        items.put(5, new Item(5, "Áo khoác jean", 250000));
        items.put(6, new Item(6, "Quần jogger", 190000));
        items.put(7, new Item(6, "Giày jordan low grey", 5500000));
    }
    
    public Item findItemById(int id){
        return items.get(id);
    }
    
    public void saveItem(Item item){
        items.put(item.getId(), item);
    }
    
    
}
