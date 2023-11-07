/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciseinclass;

import java.lang.*;

/**
 *
 * @author admin
 */
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i = 2; i<=10; i++) {
            if ((i & 1) == 0) System.out.print(i + " ");
        }
        System.out.println("");
        int i = 2;
        while (i<=10) {
            System.out.print(i + " ");
            i += 2; 
        }
        System.out.println("");
    }
    
}
