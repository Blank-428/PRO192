/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author admin
 */
public class Honda extends Car {
    
    private Boolean alloyWheel;

    public Honda(Boolean alloyWheel, String wheelStatus, int noOfWheels) {
        super(wheelStatus, noOfWheels);
        this.alloyWheel = alloyWheel;
    }

    

    public void setAlloyWheel(Boolean alloyWheel) {
        this.alloyWheel = alloyWheel;
    }

    @Override
    public String toString() {
        return (super.toString() + "\nCar alloy wheel " + this.alloyWheel);
    }
    
}
