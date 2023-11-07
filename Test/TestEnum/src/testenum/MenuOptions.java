/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testenum;

import java.util.Stack;

/**
 *
 * @author admin
 */
public enum MenuOptions {
    DONOTHING(0,"Do no thing"),
    MONDAY(2, "Monday"),
    TUESDAY(3, "Tuesday"),
    WEDNESDAY(4, "Wednesday"),
    THURSDAY(5, "Thursday"),
    FRIDAY(6, "Friday"),
    SATURDAY(7, "Saturday"),
    SUNDAY(8, "Sunday");
    
    private final int value;
    private final String label;

    MenuOptions(int value, String label) {
        this.value = value;
        this.label = label;
    }
    
    public static MenuOptions getOptionByValue(int value) throws NullPointerException {
        try {
            for (MenuOptions option: MenuOptions.values()) {
                if (option.value == value) {
                    return option;
                }
            }
            throw new NullPointerException();
        } catch (NullPointerException c) {
            System.out.println("Not found");
        } 
        return DONOTHING;
    }

    public int getValue() {
        return value;
        
    }
    
    public String getLabel() {
        return label;
    }
    
}
