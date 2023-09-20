/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionexample;

/**
 *
 * @author admin
 */
public class ExceptionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=6, y=0;
        
        try {
            System.out.println(x/y);
        } catch( ArithmeticException e) {
            e.printStackTrace();
            y = 2;
        }
        finally {
            System.out.println("Hello");
            System.out.println(x/y);
        }
    }
}
