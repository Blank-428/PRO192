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
    private final ArrayList<Book> bookList;

    public BookList() {
        bookList = new ArrayList<>();
    }

    public BookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public void addBookToList() {
        String messageAddBookToList = "Add more books (y/n): ";
        boolean running = true;
        while (running) {
            Book newBook = BookUtil.getBookFromKeyBoard(bookList);
            bookList.add(newBook);
            if (!BookUtil.GetPermissionToContinue(messageAddBookToList)) {
                running = false;
            }
        }
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
        System.out.println("Found at the position " + bookList.indexOf(searchBook));
        searchBook.showBook();
    }

    @Override
    public void updatePriceByCode() {
        Book updateBook = BookUtil.findNeededBookByCode(bookList);
        if (updateBook == null) {
            return;
        }
        System.out.println("Found at the position " + bookList.indexOf(updateBook));
        updateBook.showBook();
        
        String messageGetNewPrice = "Enter new price: ";
        double newPrice = GetValues.getDoubleValue(messageGetNewPrice);
        updateBook.setPrice(newPrice);
    }

    @Override
    public void findFirstMaxPrice() {
        Book maxPriceBook = new Book();
        double maxPrice = Double.MIN_VALUE;
        for (Book book : bookList) {
            if (maxPrice < book.getPrice()) {
                maxPrice = book.getPrice();
                maxPriceBook = book;
            }
        }
        System.out.println("Found at the position " + bookList.indexOf(maxPriceBook));
        maxPriceBook.showBook();
    }

    @Override
    public void sortAscendinglyByCode() {
        Collections.sort(bookList, (Book o1, Book o2) -> {
            return o1.getCode().compareTo(o2.getCode());
        });
    }

    @Override
    public void removeBookByCode() {
        Book removeBook = BookUtil.findNeededBookByCode(bookList);
        if (removeBook == null) {
            return;
        }
        System.out.println("Found at the position " + bookList.indexOf(removeBook));
        removeBook.showBook();
        bookList.remove(removeBook);
    }

    @Override
    public void loadDataFromFile(String fileName) throws IOException {
        bookList.clear(); //because a request is override the current list
        
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
                BookUtil.cleanUnwantedSpace(bookProperties);
                Book newBook = BookUtil.getBookFromLineInFile(bookProperties);
                bookList.add(newBook);
            }
        }
        bufferReader.close();   
    }    
    
    @Override
    public void saveDataToFile(String fileName) throws IOException {
        String messageSaveDataToFile = "Overwrite to file book.txt (y/n): ";
        if (!BookUtil.GetPermissionToContinue(messageSaveDataToFile)) {
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
    
}
