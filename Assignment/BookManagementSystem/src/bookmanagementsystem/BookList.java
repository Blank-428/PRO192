/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookmanagementsystem;

import java.io.*;
import java.util.*;


/**
 *
 * @author admin
 */
public class BookList implements IBookList{
    private ArrayList<Book> bookList;

    public BookList() {
        bookList = new ArrayList<>();
    }

    public BookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public void addBookToList() {
        Book newBook = getBookFromKeyBoard();
        bookList.add(newBook);
    }
    
    public Book getBookFromKeyBoard() {
        String xCode = GetValues.getUniqueCode(bookList);
        System.out.println("Title");
        String xTitle = GetValues.getStringValue();
        System.out.println("Quantity");
        int xQuantity = GetValues.getIntValue();
        System.out.println("Price");
        double xPrice = GetValues.getDoubleValue();
        return new Book(xCode,xTitle,xQuantity,xPrice);
    }
   
    @Override
    public void displayBookList() {
        if (bookList.isEmpty()) {
            System.out.println("The book list is empty");
            return;
        }
        System.out.printf("%-15s%-15s%-15s%-15s\n", "Book Code", "Title", "Quantity", "Price");
        for (Book book : bookList) {
            book.showBook();
        }
    }

    @Override
    public void searchBookByCode() {
        Book searchBook = BookUtil.findNeededBookByCode(bookList);
        if (searchBook == null) {
            return;
        }
        System.out.println("Founded" + bookList.indexOf(searchBook));
        searchBook.showBook();
    }

    @Override
    public void updatePriceByCode() {
        Book updateBook = BookUtil.findNeededBookByCode(bookList);
        if (updateBook == null) {
            return;
        }
        System.out.println("Founded" + bookList.indexOf(updateBook));
        updateBook.showBook();
        
        System.out.println("Enter the new book price");
        double newPrice = GetValues.getDoubleValue();
        updateBook.setPrice(newPrice);
    }

    @Override
    public void findFirstMaxPrice() {
        double maxPrice = Double.MIN_VALUE;
        int indexMaxPrice = 0;
        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            if (maxPrice < book.getPrice()) {
                maxPrice = book.getPrice();
                indexMaxPrice = i;
            }
        }
        System.out.println("Founded" + indexMaxPrice);
        bookList.get(indexMaxPrice).showBook();
    }

    @Override
    public void sortAscendinglyByCode() {
        Collections.sort(bookList, (Book o1, Book o2) -> {
            return o1.getCode().compareTo(o1.getCode());
        });
    }

    @Override
    public void removeBookByCode() {
        Book removeBook = BookUtil.findNeededBookByCode(bookList);
        if (removeBook == null) {
            return;
        }
        
        System.out.println("Founded" + bookList.indexOf(removeBook));
        removeBook.showBook();
        
        bookList.remove(removeBook);
    }

    @Override
    public void loadDataFromFile(String fileName) throws IOException {
        
        bookList.clear();
        
        BufferedReader bufferReader;
        
        try (FileReader fileReader = new FileReader(fileName)) {
            bufferReader = new BufferedReader(fileReader);
            String oneLineInFile;
            String separator = ",";
            int numberOfProperties = 4;
            String[] bookProperties;
            
            while ((oneLineInFile = bufferReader.readLine()) != null) {
                bookProperties = oneLineInFile.split(separator);
                
                if (bookProperties.length != numberOfProperties) {
                    continue;
                }
                
                cleanUnwantedSpace(bookProperties);
                
                Book newBook = BookUtil.getBookFromLineInFile(bookProperties);
                bookList.add(newBook);
            }
        }
        bufferReader.close();   
    }    
    
    public void cleanUnwantedSpace(String[] bookProperties) {
        for (String bookProperty : bookProperties) {
            bookProperty = bookProperty.trim();
        }
    }
    
    @Override
    public void saveDataToFile(String fileName) throws IOException {
        
        if (!GetPermissionToWriteToFile()) {
            return;
        }
        
        PrintWriter printWriter;
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            printWriter = new PrintWriter(fileWriter);
            for (Book book: bookList) {
                printWriter.println(book.toString());
            }
        }
        printWriter.close();
    }
    
    public boolean GetPermissionToWriteToFile() {
        String accept = "y";
        String reject = "n";
        String permission;
        System.out.println("");
        while (true) {
            try {
                permission = GetValues.getStringValue();
                if (permission.equalsIgnoreCase(accept)) {
                    return true;
                }
                if (permission.equalsIgnoreCase(reject)) {
                    return false;
                }      
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Input again");
            }
        }
    }
}
