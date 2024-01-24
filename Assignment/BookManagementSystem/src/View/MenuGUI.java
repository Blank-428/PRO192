/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.BookList;
import Util.GetValues;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class MenuGUI {
    
    public static void showMenuGUI() throws IOException {
        String fileName = "book.txt";
        BookList bookList = new BookList();
        boolean running = true;
        
        while (running) {
            showMenuOption();
            int choice = getChoiceFromKeyBoard();
            
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
                    fileName = GetValues.getStringValue("Enter file name (b = book.txt): ");
                    if(fileName.trim().equalsIgnoreCase("b")) 
                        fileName = "book.txt";
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
        bookList.saveDataToFile(fileName);
    }
    
    public static void showMenuOption() {
        for (MenuOptions option : MenuOptions.values()) {
            if (option != MenuOptions.INVALID_OPTION) {
                System.out.println(option.toString());
            }
        }    
    }

    public static int getChoiceFromKeyBoard() {
        String messageGetChoice = "   Your selection (0 -> 8): ";
        return GetValues.getIntValue(messageGetChoice);
    }

}
