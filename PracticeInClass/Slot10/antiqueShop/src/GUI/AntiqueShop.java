package GUI;

import DTO.Item;
import DTO.Painting;
import DTO.Statue;
import DTO.Vase;
import itemList.ItemList;

public class AntiqueShop {
    public static void main(String[] args) {
        String[] options = {
            "add a new vase",
            "add a new statue",
            "add a new painting",
            "display all items",
            "find the items by the creator",
            "update the item by its index",
            "remove the item by its index",
            "display the list of items type",
            "sorts items in ascending order based on their valuses",
            "exit"};
        int choice = 0;
        ItemList list = new ItemList();
        boolean cont = true;
        Item item = null;
        
        while (cont) {
            choice = Menu.getChoice(options);
            switch(choice) {
                case 1: {
                    item = new Vase();
                ((Vase)item).inputVase();
                    list.addItem(item);
                    System.out.println("Added");
                    break;
                }
                case 4: {
                    list.displayAll();
                    break;
                }
                case 10: {
                    System.out.println("Exit");
                    cont = false;
                    break;
                }
                default: {
                    System.out.println("Invalid choice");
                }
            }
        }
    }
}
