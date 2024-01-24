/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Model.Book;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

/**
 *
 * @author admin
 */
public class BookUtil {
    //use static keyword for using method via file name
        
    public static void addBookToEndOfFile(String fileName, Book newBook) throws IOException{
        try {
        String contentToAppend = newBook.toString() + "\r\n";
        Files.write(Paths.get(fileName), contentToAppend.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("File Error");
        }
    }
    public static boolean checkBookProperties(String[] bookProperties, ArrayList<Book> bookList) {
        boolean check = true;
        int numberOfProperties = 4;
        if (bookProperties.length != numberOfProperties) {
            System.out.println("Not enough book properties");
            return false;
        }
        if (!isValidCode(bookProperties[0], bookList)) {
            System.out.println("Book code is not valid");
            check = false;
        }
        if (!isValidTitle(bookProperties[1])) {
            System.out.println("Book title is not valid");
            check = false;
        }
        if (!isValidQuantity(bookProperties[2])) {
            System.out.println("Book quantity is not valid");
            check = false;
        }
        if (!isValidPrice(bookProperties[3])) {
            System.out.println("Book price is not valid");
            check = false;
        }
        return check;
    } 
    
    public static boolean isValidCode(String code, ArrayList<Book> bookList) {
        String pattern = "[0-9]{3}\\.[0-9]{1,3}";
        if (!code.matches(pattern)) {
            return false;
        }
        return !BookUtil.isDuplicate(code, bookList);
    }
    
    public static boolean isValidTitle(String Title) {
        return !Title.isEmpty();
    }
    
    public static boolean isValidQuantity(String quantity) {
        try {
                int output = Integer.parseInt(quantity);
                boolean isValidValue = (0 <= output) && (output <= Integer.MAX_VALUE);
                if (!isValidValue) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                return false;
            }
        return true;
    }
    
    public static boolean isValidPrice(String price) {
        try {
                double output = Double.parseDouble(price);
                boolean isValidValue = (0 <= output) && (output <= Double.MAX_VALUE);
                if (!isValidValue) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                return false;
            }
        return true;
    }
    
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
        return bookList.stream().anyMatch((book) -> (book.getCode().equals(xCode)));
    }
    
    public static Book findNeededBookByCode(ArrayList<Book> bookList) {
        if (bookList.isEmpty()) {
            System.out.println("The book list is empty");
            return null;
        }
        
        String messageFindNeededBookByCode = "Find book again (y/n): ";
        boolean running = true;
        while (running) {
            String messageGetFindCode = "Enter code (format 000.000): ";
            String findCode = GetValues.getCodeFromKeyBoard(messageGetFindCode);
        
            for (Book book : bookList) {
                if (book.getCode().equalsIgnoreCase(findCode)) {
                    return book;
                }
            }
            System.out.println("Not found");
            if (!GetPermissionToContinue(messageFindNeededBookByCode)) {
                running = false;
            }
        }
        return null;
    }
    
    public static Book getBookFromLineInFile(String[] bookProperties) {
        String xCode = bookProperties[0];
        String xTitle = bookProperties[1];
        int xQuantity = Integer.parseInt(bookProperties[2]);
        double xPrice = Double.parseDouble(bookProperties[3]);      
        return new Book(xCode, xTitle, xQuantity, xPrice);
    }
        
        
    public static void clearUnwantedSpace(String[] bookProperties) {
        for (int i = 0; i < bookProperties.length; i++) {
            bookProperties[i] = bookProperties[i].trim().replaceAll("\\s+"," ");
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
