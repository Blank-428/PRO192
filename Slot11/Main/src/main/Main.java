/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] a = {"Hoa", "La", "Canh", "Cay", "Goc", "Re"};
        int[] b = {22, 21, 24, 19, 18, 20};
        double[] c = {500, 700, 400, 200, 600, 500};
        MyList u = new MyList();
        u.addMany(a, b, c);
        u.display();
    }
    
}
