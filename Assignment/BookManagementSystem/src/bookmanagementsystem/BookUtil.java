/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookmanagementsystem;

import java.util.*;

/**
 *
 * @author admin
 */
public class BookUtil {
    
    public static Book getBookFromKeyBoard(ArrayList<Book> bookList) {
        String messageGetCode = "Enter code (format 000.000): ";
        String xCode = GetValues.getUniqueCode(messageGetCode,bookList);
        
        String messageGetTitle = "Enter title: ";
        String xTitle = GetValues.getStringValue(messageGetTitle);
        
        String messageGetQuantity = "Enter quantity: ";
        int xQuantity = GetValues.getIntValue(messageGetQuantity);
        
        String messageGetPrice = "Enter price: ";
        double xPrice = GetValues.getDoubleValue(messageGetPrice);
        
        return new Book(xCode,xTitle,xQuantity,xPrice);
    }

    public static boolean isDuplicate(String xCode, ArrayList<Book> bookList) {
        if (bookList.isEmpty()) {
            return false;
        }
        for (Book book : bookList) {
            if (book.getCode().equals(xCode)) {
                return true;
            }
        }
        return false;
    }
    
    public static Book findNeededBookByCode(ArrayList<Book> bookList) {
        if (bookList.isEmpty()) {
            System.out.println("The book list is empty");
            return null;
        }
        
        String messageGetFindCode = "Enter code (format 000.000): ";
        String findCode = GetValues.getCodeFromKeyBoard(messageGetFindCode);
        
        for (Book book : bookList) {
            if (book.getCode().equalsIgnoreCase(findCode)) {
                return book;
            }
        }
        System.out.println("Not found");
        return null;
    }
    
    public static Book getBookFromLineInFile(String[] bookProperties) {
        String xCode = bookProperties[0];
        String xTitle = bookProperties[1];
        int xQuantity = Integer.parseInt(bookProperties[2]);
        double xPrice = Double.parseDouble(bookProperties[3]);      
        return new Book(xCode, xTitle, xQuantity, xPrice);
    }
        
        
    public static void cleanUnwantedSpace(String[] bookProperties) {
        for (String bookProperty : bookProperties) {
            bookProperty = bookProperty.trim();
        }
    }
    
    public static boolean GetPermissionToContinue(String message) {
        String accept = "y";
        String reject = "n";
        String permission;
        while (true) {
            permission = GetValues.getStringValue(message);
            if (permission.equalsIgnoreCase(accept)) {
                return true;
            }
            if (permission.equalsIgnoreCase(reject)) {
                return false;
            }
            System.out.println("Invalid option");
        }
    }
}
