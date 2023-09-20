/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionexample;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ExcepVer3Class {
    public static int inputInteger() throws Exception {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a whole number: ");
        int n = Integer.parseInt(in.nextLine());
        if ( n<10 || n>50) throw new Exception();
        return n;
    }
    public static void main(String[] args) {
        boolean cont=true;
        int n=0;
        do {
            try {
                n = inputInteger();
                cont = false;
            } catch (Exception e) {
                System.out.println("Required integer!");
            }
        } while (cont);
        System.out.println("number: "+n);
    }
}
