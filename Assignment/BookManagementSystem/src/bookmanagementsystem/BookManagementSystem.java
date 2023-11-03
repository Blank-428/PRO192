/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookmanagementsystem;


/**
 *
 * @author admin
 */
public class BookManagementSystem {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean running = true;
        while (running) {
            int choice = MenuGUI.getChoiceFromKeyBoard();
            MenuOptions option = MenuOptions.getOptionByValue(choice);
            switch (option) {
                case ADD_BOOK_TO_LIST: {
                    Book book = new Book("12","12",12,12.0);
                    System.out.println(book.toString());
                    option.showStatus();
                    break;
                }
                case DISPLAY_ALL_BOOKS: {
                    option.showStatus();
                    break;
                }
                case SEARCH_BOOK_BY_CODE: {
                    option.showStatus();
                    break;
                }
                case UPDATE_PRICE_BY_CODE: {
                    option.showStatus();
                    break;
                }
                case FIND_THE_FIRST_MAX_PRICE: {
                    option.showStatus();
                    break;
                }
                case SORT_ASCENDINGLY_BY_CODE: {
                    option.showStatus();
                    break;
                }
                case REMOVE_BOOK_BY_CODE: {
                    option.showStatus();
                    break;
                }
                case LOAD_DATA_FROM_FILE: {
                    option.showStatus();
                    break;
                }
                case EXIT_PROGRAM: {
                    option.showStatus();
                    break;
                }
                default: {
                    System.out.println("Invalid option");
                    running = false;
                    break;
                }
            } 
        }  
    }
    
}
