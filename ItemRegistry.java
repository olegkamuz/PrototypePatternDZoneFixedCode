package Prototype;

import java.util.Hashtable;

public class ItemRegistry {
    private Hashtable map = new Hashtable();

    public ItemRegistry() {
        loadCache();
    }

    public Item createBasicItem(String type) {
        return (Item)map.get(type);
        //.clone();
    }

    private void loadCache() {
        Book book = new Book();
        book.setTitle("Design Patterns");
        book.setPrice(20.00);
        map.put("Book", book);
        CD cd = new CD();
        cd.setTitle("Various");
        cd.setPrice(10.00);
        map.put("CD", cd);
    }
}

