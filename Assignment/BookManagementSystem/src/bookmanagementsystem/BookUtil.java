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

    public static boolean isDuplicate(String xCode, ArrayList<Book> bookList) {
        if (bookList.isEmpty()) {
            return false;
        }
        for (Book book : bookList) {
            if (book.getCode().equals(xCode)) {
                return true;
            } else {
            }
        }
        return false;
    }
    
    public static Book findNeededBookByCode(ArrayList<Book> bookList) {
        if (bookList.isEmpty()) {
            System.out.println("The book list is empty");
            return null;
        }
        System.out.println("Enter the book code to find");
        String findCode = GetValues.getStringValue();
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
        
}
