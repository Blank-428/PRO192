/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itemList;
import DTO.Item;
import DTO.Painting;
import DTO.Statue;
import DTO.Vase;
/**
 *
 * @author admin
 */
public class ItemList extends Item {
    
    private Item[] list;
    private int numOfItem;
    private int MAX = 100;

    public ItemList() {
        this.list = new Item[this.MAX];
        this.numOfItem = 0;
    }
    
    public boolean addItem(Item item) {
        if (numOfItem >= MAX || item == null) {
            System.out.println("The list is full");
            return false;
        }
        list[numOfItem++] = item; 
        return true;
    }
    
    public void displayAll() {
        if (numOfItem == 0) {
            System.out.println("The list is empty");
        }
        for (int i = 0; i < numOfItem; i++) {
            list[i].output();
        }
    }
    
    public Item findItem(String creator) {
        if (numOfItem == 0) {
            System.out.println("The list is empty");
            return null;
        }
        for (int i = 0; i < numOfItem; i++) {
            if (list[i].getCreator().equals(creator)) {
                return list[i];
            }
        }
        System.out.println("Not found");
        return null;
    }
    
    public int findItemIndex(String creator) {
        if (numOfItem == 0) {
            System.out.println("The list is empty");
            return -1;
        }
        for (int i = 0; i < numOfItem; i++) {
            if (list[i].getCreator().equals(creator)) {
                return i;
            }
        }
        System.out.println("Not found");
        return -1;
    }
    
    public boolean updateItem(int index) {
        if (numOfItem == 0) {
            System.out.println("The list is empty");
            return false;
        }
        if (index < 0 && index > numOfItem) {
            System.out.println("Index isnt valid");
            return false;
        }
        list[index].input();
        return true;
    }
    
    public boolean removeItem(int index) {
        if (numOfItem == 0) {
            System.out.println("The list is empty");
            return false;
        }
        if (index < 0 && index > numOfItem) {
            System.out.println("Index isnt valid");
            return false;
        }
        for(int i = index; i < numOfItem; i++) {
            list[i] = list[i+1];
        }
        numOfItem--;
        return true;
    }
    
    public void displayItemsByType(String type) {
        if (numOfItem == 0) {
            System.out.println("The list is empty");
            return;
        }
        if (type.equals("Vase")) {
            for (int i = 0; i < numOfItem; i++) {
                if (list[i] instanceof Vase) {
                    list[i].output();
                }
            }
        }
        if (type.equals("Painting")) {
            for (int i = 0; i < numOfItem; i++) {
                if (list[i] instanceof Painting) {
                    list[i].output();
                }
            }
        }
        if (type.equals("Statue")) {
            for (int i = 0; i < numOfItem; i++) {
                if (list[i] instanceof Statue) {
                    list[i].output();
                }
            }
        }
    }
    
    public void sortItems() {
        for (int i = 0; i < numOfItem-1; i++) {
            for (int j = i+1; j < numOfItem; j++) {
                if (list[i].getValue() > list[j].getValue()) {
                    Item tmp = list[i];
                    list[i] = list[j];
                    list[j] = tmp;
                }
            }
        }
    }
}
