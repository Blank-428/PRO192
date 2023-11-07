/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ques1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter designer: ");
        String designer = sc.nextLine();
        
        System.out.print("Enter power: ");
        int power = Integer.parseInt(sc.nextLine());
        
        Engine egi = new Engine(designer, power);
        
        System.out.println("1. Test getDesigner()");
        System.out.println("2. Test setPower()");
        System.out.print("Enter TC (1 or 2): ");
        int option = Integer.parseInt(sc.nextLine());
        
        if (option == 1) {
            System.out.println("OUTPUT");
            System.out.println(egi.getDesigner());
        }
        if (option == 2) {
            System.out.print("Enter new power: ");
            power = Integer.parseInt(sc.nextLine());
            egi.setPower(power);
            System.out.println("OUTPUT");
            System.out.println(egi.getPower());
        }
    }
}
