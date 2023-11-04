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
    public static String autoGenerateCode(ArrayList<Book> bookList) {
        int firstHalfStringLength = 3;
        int secondHalfStringLength = 2;
        String pivot = ".";
        
        String buffer = new String();

        while (true) {
            buffer = buffer.concat(addRandomCharToBuffer(firstHalfStringLength));
            buffer = buffer.concat(pivot);
            buffer = buffer.concat(addRandomCharToBuffer(secondHalfStringLength));

            if (!BookUtil.isDuplicate(buffer,bookList)) {
                return buffer;
            }
        }
    }
    
    public static String addRandomCharToBuffer(int stringLength) {
        int leftLimit = 48; // letter '0'
        int rightLimit = 57; // letter '9'
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(stringLength);
        for (int i = 0; i < stringLength; i++) {
                int randomLimitedInt = leftLimit + (int) 
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
                    buffer.append((char) randomLimitedInt);
                }
        return buffer.toString();
    }

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
}
