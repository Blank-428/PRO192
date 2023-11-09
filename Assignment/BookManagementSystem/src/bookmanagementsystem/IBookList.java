/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookmanagementsystem;

import java.io.IOException;

/**
 *
 * @author admin
 */
public interface IBookList {
    public void addBookToList() throws IOException;
    public void displayBookList();
    public void searchBookByCode();
    public void updatePriceByCode();
    public void findFirstMaxPrice();
    public void sortAscendinglyByCode();
    public void removeBookByCode();
    public void loadDataFromFile(String fileName) throws IOException;
    public void saveDataToFile(String fileName) throws IOException;
}
