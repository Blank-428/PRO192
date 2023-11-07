/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques1;

/**
 *
 * @author admin
 */
public class Engine {
   private String designer;
   private int power;

   public Engine() {
   }

    public Engine(String designer, int power) {
        this.designer = designer;
        this.power = power;
    }

    public String getDesigner() {
        designer = designer.substring(0, 3).toLowerCase();
        return designer;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
   
    
}
