/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanager;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Inputter {
    public static Scanner sc = new Scanner(System.in);
    public static int inputInt(String msg, int min, int max) {
        if (min > max) {
            int t = min;
            min = max;
            max = t;
        }
        int data = 0;
        boolean cont = true;
        do {
            try {
                System.out.println(msg);
                data = Integer.parseInt(sc.nextLine());
                if (data < min || data > max) {
                    throw new Exception();
                }
                cont = false;
            } catch (Exception ex) {
                System.out.println("Invalid value");
            }
        } while (cont);
        return data;
    }
    public static String inputStr(String msg) {
        System.out.println(msg);
        String data = sc.nextLine().trim();
        return data;
    }
    public static String inputNonBlankStr(String msg) {
        String data = null;
        boolean cont = true;
        do {
            try {
                System.out.println(msg);
                data = sc.nextLine().trim();
                if (data.length()==0) {
                    throw new Exception();
                }
                cont = false;
            } catch (Exception ex) {
                System.out.println("Invalid value");
            }
        } while (cont);
        return data;
    }
    public static String inputPattern(String msg, String pattern) {
        String data = null;
        Boolean cont = true;
        do {
            try {
                System.out.println(msg);
                data = sc.nextLine().trim();
                if (!data.matches(pattern)) {
                    throw new Exception();
                }
                cont = false;
            } catch (Exception ex) {
                System.out.println("Invalid value");
            }
        } while (cont);
        return data;
    }
}
