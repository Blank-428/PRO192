/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

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
        String SpecLabel = super.getLabel();
        super.setLabel(SpecLabel.substring(0, 1) + this.step + SpecLabel.substring(1, SpecLabel.length()));
    }
    public int getValue() {
        int SpecType = super.getType();
        String SpecLabel = super.getLabel();
        if (SpecType < 3 && SpecLabel.contains("A")) {
            return this.step;
        } 
        return this.step + 2;
    }
}
