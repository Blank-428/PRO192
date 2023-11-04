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
public enum MenuOptions {
    
    ADD_BOOK_TO_LIST(1, "Input & add book(s) to the end") {
        @Override
        public void showStatus() {
            System.out.println("Add the book to list successfully");
        }
    },
    DISPLAY_ALL_BOOKS(2, "Display all books") {
        @Override
        public void showStatus() {
            System.out.println("Show book list successfully");
        }
    },
    SEARCH_BOOK_BY_CODE(3, "Search a book for given code") {
        @Override
        public void showStatus() {
            System.out.println("Search a book by code successfully");
        }
    },
    UPDATE_PRICE_BY_CODE(4, "Update the book's price for given code") {
        @Override
        public void showStatus() {
            System.out.println("Update the book's price successfully");
        }
    },
    FIND_THE_FIRST_MAX_PRICE(5, "Find the (first) max price value") {
        @Override
        public void showStatus() {
            System.out.println("Find the max book's price successfully");
        }
    },
    SORT_ASCENDINGLY_BY_CODE(6, "Sort the list ascendingly by code") {
        @Override
        public void showStatus() {
            System.out.println("Sort the book list successfully");
        }
    },
    REMOVE_BOOK_BY_CODE(7, "Remove the book having given code") {
        @Override
        public void showStatus() {
            System.out.println("Remove the book successfully");
        }
    },
    LOAD_DATA_FROM_FILE(8, "Load data from file") {
        @Override
        public void showStatus() {
            System.out.println("Load data from file successfully");
        }
    },
    EXIT_PROGRAM(0,"Exit") {
        @Override
        public void showStatus() {
            System.out.println("Exit the program");
        }
    },
    INVALID_OPTION(-1,"Invalid option") {
        @Override
        public void showStatus() {
            System.out.println("Invalid option. Input again.");
        }
    };
    
    private final int value;
    private final String label;

    MenuOptions(int value, String label) {
        this.value = value;
        this.label = label;
    }
    
    public static MenuOptions getOptionByValue(int value) {
        for (MenuOptions option: MenuOptions.values()) {
             if (option.value == value) {
                 return option;
            }
        }
        return INVALID_OPTION;
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return value + ". " + label;
    }
    
    public void showStatus() {
    };
}
