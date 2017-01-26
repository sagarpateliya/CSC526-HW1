/**
 * Created by Sa
 *
 * gar on 1/21/2017.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Catalog implements Iterable {
    private ArrayList<Item> catalog;
    String storeName;
    String item;


    Catalog(String storeName) {
        this.storeName = storeName;


    }

    public String add() {

        return item;
    }
    public Item getItem(String name) {
        for (Item i : catalog) {
            if (i.getName() == name) {
                return i;
            }
        }
        return (new Item("Java Rules!", 1));
    }

    public String getStoreName() {
        return storeName;
    }

    public void Iterator() {
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
