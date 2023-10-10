/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import static GetInput.GetValues.getIntValue;
import static GetInput.GetValues.getStringValue;

/**
 *
 * @author admin
 */
public class Statue extends Item {
    private int weight;
    private String colour;

    public Statue() {
    }

    public Statue(int weight, String colour, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
        public void inputStatue() {
        super.input();
        System.out.println("Input weight: ");
        this.weight = getIntValue();
        System.out.println("Input colour: ");
        this.colour = getStringValue();
    }
    
    public void outputStatue() {
        System.out.println("Their Statue's attributes are: ");
        super.output();
        System.out.println("Weight: " + this.weight);
        System.out.println("Colour: " + this.colour);
    }
}
