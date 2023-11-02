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
        String specLabel = super.getLabel();
        super.setLabel(specLabel.substring(0, 1) + this.step + specLabel.substring(1, specLabel.length()));
    }
    public int getValue() {
        int specType = super.getType();
        String specLabel = super.getLabel();
        if (specType < 3 && specLabel.contains("A")) {
            return this.step;
        } 
        return this.step + 2;
    }
}
