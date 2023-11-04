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
        String xCode = BookUtil.autoGenerateCode(bookList);
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
        System.out.println("Founded");
        searchBook.showBook();
    }

    @Override
    public void updatePriceByCode() {
        Book updateBook = BookUtil.findNeededBookByCode(bookList);
        if (updateBook == null) {
            return;
        }
        System.out.println("Founded");
        updateBook.showBook();
        
        System.out.println("Enter the new book price");
        double newPrice = GetValues.getDoubleValue();
        updateBook.setPrice(newPrice);
    }

    @Override
    public void findFirstMaxPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sortAscendinglyByCode() {
        Collections.sort(bookList, (Book o1, Book o2) -> {
            return o1.getCode().compareTo(o1.getCode());
        });
    }

    @Override
    public void removeBookByCode() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void loadDataFromFile(String fileName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
