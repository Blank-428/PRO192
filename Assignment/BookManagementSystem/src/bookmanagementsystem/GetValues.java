/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookmanagementsystem;

import java.util.*;

public class GetValues {
    private static final Scanner SC = new Scanner(System.in);
    // use static bs parse is a static method
    // cause Runtime Error when remove static keyword
    public static int getIntValue(String message) {
        while (true) {
            System.out.print(message);
            try {
                int output = Integer.parseInt(SC.nextLine());
                boolean isValidValue = (0 <= output) && (output <= Integer.MAX_VALUE);
                if (isValidValue) {
                   return output;
                }
                throw new NumberFormatException();                
            } catch (NumberFormatException e) {
                System.out.println("Invalid value");
            }
        }
    }
    
    public static String getUniqueCode(String message, ArrayList<Book> bookList) {
        String xCode;
        while (true) {
            xCode = getCodeFromKeyBoard(message);
            if (!BookUtil.isDuplicate(xCode,bookList)) {
                return xCode;
            }
            System.out.println("The code is duplicate");
        }
    }
    
    public static String getCodeFromKeyBoard(String message) {
        String pattern = "[0-9]{3}.[0-9]{1,3}";
        String xCode;
        while (true) {
            xCode = getStringValue(message);
            boolean isValidCode = xCode.matches(pattern);
            if (isValidCode) {
                return xCode;
            } else {
                System.out.println("Invalid code");
            }
        }
    }
    
    public static String getStringValue(String message) {
        while (true) {
            System.out.print(message);
            try {
                String output = SC.nextLine().trim().replaceAll("\\s+"," ");
                if (!output.isEmpty()) {
                    return output;
                }
                throw new Exception();
            } catch(Exception e) {
                System.out.println("Invalid value"); 
            }
        }
    }
    
    public static double getDoubleValue(String message) {
        while (true) {
            System.out.print(message);
            try {
                double output = Double.parseDouble(SC.nextLine());
                boolean isValidValue = (0 <= output) && (output <= Double.MAX_VALUE);
                if (isValidValue) {
                   return output;
                }
                throw new NumberFormatException();
            } catch (NumberFormatException e) {
                System.out.println("Invalid value");
            }
        }
    }
}