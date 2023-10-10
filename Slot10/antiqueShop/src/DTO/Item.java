package DTO;

import static GetInput.GetValues.getIntValue;
import static GetInput.GetValues.getStringValue;

public class Item {
    private int value;
    private String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public void input() {
        System.out.println("Input value: ");
        this.value = getIntValue();
        System.out.println("Input creator: ");
        this.creator = getStringValue();      
    }
    
    public void output() {
        System.out.println("Value: " + this.value);
        System.out.println("Creator: " + this.creator);
    }

}
