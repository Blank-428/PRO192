/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author admin
 */
public class Dog {
    // attributes
    // attributes only changed by in-class methods
    private String name;
    private int yob;
    private double weight;
    
    // constructor 
    public Dog(String iName, int iYob, double iWeight) {
        this.name = iName; // this refers to the current object
        this.yob = iYob;
        this.weight = iWeight;
    }
    
    // methods = regular function
    public void bark() {
        System.out.println("My name is " + this.name);
        System.out.printf("|%-10s|%4d|%4.1f|\n",this.name,this.yob,this.weight);
    }
    
    // setSt() = change new value
    public void setYob(double newWeight) {
        this.weight = newWeight;
    }
    
    // getSt() = give infor st in class

    public int getYob() {
        return yob;
    }
  
    
    @Override // to return custom values of the object
    public String toString() {
        String tmpMsg = "Dog{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
        return tmpMsg;
    }
}
