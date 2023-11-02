/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ManageProgram {
    public static void main(String[] args) {
        String filename = "employees.txt";
        int userChoice = 0;
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        menu.add("Add new employee");
        menu.add("Remove an employee");
        menu.add("Promoting the employee's salary");
        menu.add("Print the list");
        menu.add("Save to files");
        menu.add("Quit");
        boolean changed = false;
        EmpList list = new EmpList();
        list.AddFromFile(filename);
        do {
            System.out.println("EMPLOYEE MANAGER");
            userChoice = menu.getUserChoice();
            switch(userChoice) {
                case 1: {
                    list.addNewEmp();
                    changed = true;
                    break;
                }
                case 2: {
                    list.removeEmp();
                    changed = true;
                    break;
                }
                case 3: {
                    list.promote();
                    changed = true;
                    break;
                }
                case 4: {
                    list.print();
                    break;
                }
                case 5: {
                    list.saveToFile(filename);
                    changed = false;
                    break;
                }
                default: {
                    if (changed) {
                        System.out.println("Save changes Y/N? ");
                        String response = sc.nextLine().toUpperCase();
                        if (response.startsWith("Y")) {
                            list.saveToFile(filename);
                        }
                    }
                }
            }
        }
        while (userChoice > 0 && userChoice < 6);
    }
}
