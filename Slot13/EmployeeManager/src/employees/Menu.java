/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author admin
 */
public class Menu extends Vector<String> {

    public Menu() {
        super();
    }
    
    void addMenuItem(String s) {
        this.add(s);
    }
    
    int getUserChoice() {
       Scanner sc = new Scanner(System.in);
       
       
       for (int i = 0; i < this.size(); i++) {
            System.out.println((i + 1) + "-" + this.get(i));
       }
       System.out.println("");
       System.out.println("-------------------------");
       System.out.print("Select 1.." + this.size() + ": ");
       
       int choice = sc.nextInt();
       
       return choice;
    }

}
