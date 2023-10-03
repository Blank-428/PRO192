/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class SpecCar extends Car {
    protected int type;

    public SpecCar() {
    }

    public SpecCar(int type) {
        this.type = type;
    }

    public SpecCar(String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + type;
    }
    
    public void setData() {
        super.setMaker("XZ" + super.getMaker());
        super.price = super.getPrice() + 20; 
    }
    
    public int getValue() {
        int inc = (type<7)? 10: 15;
        return price+inc;
    }
}
