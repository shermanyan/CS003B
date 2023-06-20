/*
Author: Sherman Yan, Henry Thai
 */
package Market;

import java.util.ArrayList;

/**
 * This class represents a customer's shopping cart
 */
public class ShoppingCart {
    private ArrayList<Item> items;

    /**
     * Constructor to create an empty shopping cart
     */
    public ShoppingCart() {
        items = new ArrayList<Item>();
    }

    /**
     * Add item details to cart
     * @param name
     * @param cost
     */
    public void addItem(String name, double cost){
        items.add(new Item(name, cost));
    }

    /**
     * remove an item name
     * @param name
     */
    public void removeItem (String name){
        for (int i = 0; i< items.size(); i++){
            if(name.equals(items.get(i).name)){
                items.remove(i);
                break;
            }
        }
    }

    /**
     * Get the cart
     * @return cart
     */
    public Item[] getCart(){
        Item[] output = new Item[items.size()];
        for (int i = 0 ;i < output.length ; i++){
            output[i] = new Item(items.get(i).name,items.get(i).cost);
        }
        return output;
    }
}
