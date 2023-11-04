/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookmanagementsystem;

import java.util.*;

public class GetValues {
    private static final Scanner sc = new Scanner(System.in);
    // use static bs parse is a static method
    // cause Runtime Error when remove statics
    public static int getIntValue() {
        int output = 0;
        do {
            try {
                output = Integer.parseInt(sc.nextLine());
                if ((0 <= output) && (output <= Integer.MAX_VALUE)) {
                   break;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid value. Input the value again");
            }
        }   while (true);
        return output;
    }
    
    public static String getUniqueCode(ArrayList<Book> bookList) {
        String pattern = "[0-9]{3}.[0-9]{1,3}";
        String xCode;
        while (true) {
            System.out.println("Enter code (format 000.000)");
            xCode = getStringValue();
            boolean isValidCode = xCode.matches(pattern) && (!BookUtil.isDuplicate(xCode,bookList));
            if (isValidCode) {
                return xCode;
            }
        }
    }
    
    public static String getStringValue() {
        String output;
        do {
            try {
                output = sc.nextLine();
                if (!output.equals("")) {
                    break;
                } else {
                    throw new Exception();
                }
            } catch(Exception e) {
                System.out.println("Invalid value. Input the value again"); 
            }
        }   while (true);
        return output;
    }
    
    public static double getDoubleValue() {
        double output = 0;
        do {
            try {
                output = Double.parseDouble(sc.nextLine());
                if ((0 <= output) && (output <= Double.MAX_VALUE)) {
                   break;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid value. Input the value again");
            }
        }   while (true);
        return output;
    }
    
}