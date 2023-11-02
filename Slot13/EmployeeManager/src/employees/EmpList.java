/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

import java.io.*;
import java.util.*;

/**
 *
 * @author admin
 */
public class EmpList extends Vector<Employee> {
    private Scanner sc;

    public EmpList() {
        super();
    }
    
    public void AddFromFile(String fName) {
        try {
            File f = new File(fName);
            if (!f.exists()) {
                return;
            }
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            String details;
            while ((details = bf.readLine()) != null) {
                StringTokenizer stk = new StringTokenizer(details, ",");
                String code = stk.nextToken().toUpperCase();
                String name = stk.nextToken().toUpperCase();
                int salary = Integer.parseInt(stk.nextToken());
                Employee emp = new Employee(code, name, salary);
                this.add(emp);
            }
            bf.close();
            fr.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public void addNewEmp() {
        String newCode, newName;
        int salary;
        int pos;
        boolean valid = true;
        System.out.println("Enter New Employee Details:");
        do {
            System.out.println("code E000:");
            sc = new Scanner(System.in);
            newCode = sc.nextLine().toUpperCase();
            System.out.println(newCode);
            pos = find(newCode);
            valid = newCode.matches("^E\\d{3}$");
            if (pos >= 0) System.out.println("The code is duplicated.");
            if (!valid) System.out.println("The code: E and 3 digits.");
        }
        while (pos >= 0 || (!valid));
        System.out.println("Name:");
        newName = sc.nextLine().toUpperCase();
        System.out.println("Salary:");
        salary = Integer.parseInt(sc.nextLine());
        this.add(new Employee(newCode, newName, salary));
        System.out.println("New Employee has been added");
    }
    
    private int find(String aCode) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getCode().equals(aCode)) return i;
        }
        return -1;
    }
    
    public void print() {
        if (this.size() == 0) {
            System.out.println("Empty list.");
            return;
        }
        Collections.sort(this);
        System.out.println("\nEMPLOYEE LIST");
        System.out.println("--------------------------------");
        for (Employee thi : this) {
            thi.print();
        }
    }
    
    public void promote() {
        String code;
        System.out.println("Enter the code of promoted employee: ");
        code = sc.nextLine().toUpperCase();
        int pos = fine(code);
        if (pos < 0) {
            System.out.println("This code does not exist.");
            return;
        }
        int oldsalary = this.get(pos).getSalary();
        int newsalary;
        do {
            System.out.print("Old salary: " + oldsalary + ", new salary: ");
            newsalary = Integer.parseInt(sc.nextLine());
        }
        while (newsalary < oldsalary);
        this.get(pos).setSalary(newsalary);
        System.out.println("The employee" + code + " has been updated.");
    } 
    
    public void removeEmp() {
        String code;
        System.out.println("Enter the code of removed employee: ");
        code = sc.nextLine().toUpperCase();
        int pos = find(code);
        if (pos < 0) {
            System.out.println("This code does not exist");
            return;
        }
        this.remove(pos);
        System.out.println("The employee " + code + " has been removed.");        
    }
    
    public void saveToFile(String fname) {
        if (this.size() == 0) {
            System.out.println("Empty list");
            return;
        }
        try {
            File f = new File(fname);
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            for (Employee x: this) {
                pw.println(x.getCode() + "," + x.getName() + "," + x.getSalary());
            }
            fw.close();
            pw.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
