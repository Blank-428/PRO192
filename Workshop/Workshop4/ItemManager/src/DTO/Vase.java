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
public class Vase extends Item {
    private int height;
    private String material;

    public Vase() {
    }

    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void inputVase() {
        super.input();
        System.out.println("Input height: ");
        this.height = getIntValue();
        System.out.println("Input material: ");
        this.material = getStringValue();
    }
    
    public void outputVase() {
        System.out.println("Their Vase's attributes are: ");
        super.output();
        System.out.println("Height: " + this.height);
        System.out.println("Material: " + this.material);
    }
}
