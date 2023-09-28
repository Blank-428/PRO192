/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2.;

/**
 *
 * @author admin
 */
public class Robot {
    protected String label;
    protected int type;

    public Robot() {
    }

    public Robot(String label, int type) {
        this.label = label;
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getType() {
        return type;
    }

    @Override
    public String toString() {
        return label + ", " + type;
    }
    
    
    
}
