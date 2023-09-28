/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ques2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter label: ");
        String label = sc.nextLine();
        
        System.out.print("Enter type: ");
        int type = Integer.parseInt(sc.nextLine());
        
        System.out.print("Enter step: ");
        int step = Integer.parseInt(sc.nextLine());
        
        SpecRobot robot1 = new SpecRobot(label, type, step);
        
        System.out.println("1. Test toString()");
        System.out.println("2. Test setData()");
        System.out.println("3. Test getValue()");
        System.out.print("Enter TC (1, 2. 3): ");
        int option = Integer.parseInt(sc.nextLine());
        
        System.out.println("OUTPUT");
        
        if (option == 1) {
            System.out.println(robot1.toString());
        }
        if (option == 2) {
            robot1.setData();
        }
        if (option == 3) {
            System.out.println(robot1.getValue());
        }
    }
}
