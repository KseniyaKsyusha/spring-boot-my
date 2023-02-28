package ua.zp.kosse.oksana.tommy.springbootmy.repository;

import org.springframework.stereotype.Repository;
import ua.zp.kosse.oksana.tommy.springbootmy.service.Item;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProjectRepository {

    private static List<Item> loadItemsFromDB() {
        List<Item> itmObject = new ArrayList<>();
        itmObject.add(new Item("privat24", "2022-01-22 22:49:52", 673, "no success"));
        itmObject.add(new Item("oschad24", "2022-01-22 22:49:52", 600, "no success"));
        itmObject.add(new Item("aval24", "2022-01-22 22:49:52", 1673, "success"));
        itmObject.add(new Item("mono24", "2022-01-22 22:49:52", 673, "no success"));
        return itmObject;
    }

    private final List<Item> items = loadItemsFromDB();
    //private final List<Item> itemsNew = new ArrayList <>();

    public List<Item> getAllItems() {
        return items;
    }

    public void addItems(Item item) {
        items.add(item);

    }

    public List<Item> addItemsNS() {
        final List<Item> itemsNew = new ArrayList<>();
        for (Item currentItem : items) {
            if (!currentItem.getResult().equals("success")) {
                itemsNew.add(currentItem);
            }
        }
        return itemsNew;
    }

    public List<Item> addItemsS() {
        final List<Item> itemsNew = new ArrayList<>();
        for (Item currentItem : items) {
            if (currentItem.getResult().equals("success")) {
                itemsNew.add(currentItem);
            }
        }
        return itemsNew;
    }

    public List<Item> addTimeL() {
        final List<Item> itemsNew = new ArrayList<>();
        for (Item currentItem : items){
            if (currentItem.getCompilationTime()>=1000){
                itemsNew.add(currentItem);
            }
        }
        return itemsNew;
    }

    public List<Item> addTimeN() {
        final List<Item> itemsNew = new ArrayList<>();
        for (Item currentItem : items){
            if (currentItem.getCompilationTime()<1000){
                itemsNew.add(currentItem);
            }
        }
        return itemsNew;
    }
}
