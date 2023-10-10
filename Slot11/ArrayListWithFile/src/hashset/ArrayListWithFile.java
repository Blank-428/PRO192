/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashset;

import java.io.IOException;

/**
 *
 * @author admin
 */
public class ArrayListWithFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        MyList u = new MyList();
        String fname = "emp.txt";
        u.loadFile(fname);
        System.out.println("Test sorting by age and name");
        System.out.println("Before sorting");
        u.display();
        System.out.println("After sorting");
        u.sortByAgeName();
        u.display();
    }
    
}
