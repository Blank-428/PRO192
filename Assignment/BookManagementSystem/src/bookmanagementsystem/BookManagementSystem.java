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
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fileName = "book.txt";
        BookList bookList = new BookList();
        boolean running = true;
        while (running) {
            int choice = MenuGUI.getChoiceFromKeyBoard();
            MenuOptions option = MenuOptions.getOptionByValue(choice);
            switch (option) {
                case ADD_BOOK_TO_LIST: {
                    bookList.addBookToList();
                    option.showStatus();
                    break;
                }
                case DISPLAY_ALL_BOOKS: {
                    bookList.displayBookList();
                    option.showStatus();
                    break;
                }
                case SEARCH_BOOK_BY_CODE: {
                    bookList.searchBookByCode();
                    option.showStatus();
                    break;
                }
                case UPDATE_PRICE_BY_CODE: {
                    bookList.updatePriceByCode();
                    option.showStatus();
                    break;
                }
                case FIND_THE_FIRST_MAX_PRICE: {
                    bookList.findFirstMaxPrice();
                    option.showStatus();
                    break;
                }
                case SORT_ASCENDINGLY_BY_CODE: {
                    bookList.sortAscendinglyByCode();
                    option.showStatus();
                    break;
                }
                case REMOVE_BOOK_BY_CODE: {
                    bookList.removeBookByCode();
                    option.showStatus();
                    break;
                }
                case LOAD_DATA_FROM_FILE: {
                    bookList.loadDataFromFile(fileName);
                    option.showStatus();
                    break;
                }
                case EXIT_PROGRAM: {
                    option.showStatus();
                    running = false;
                    break;
                }
                case INVALID_OPTION: {
                    option.showStatus();
                    break;
                }
            } 
        }  
    }
    
}
