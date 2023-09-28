/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques2;

/**
 *
 * @author admin
 */
public class SpecRobot extends Robot {
    private int step;

    public SpecRobot() {
    }

    public SpecRobot(String label, int type, int step) {
        super(label, type);
        this.step = step;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", " + this.step;
    }
    
    public void setData() {
        super.setLabel(label.substring(0, 1) + this.step + label.substring(1, label.length()));
    }
    public int getValue() {
        if (super.type < 3 && super.label.contains("A")) {
            return this.step;
        } 
        return this.step + 2;
    }
}
