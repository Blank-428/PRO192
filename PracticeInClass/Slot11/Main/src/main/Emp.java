/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author admin
 */
public class Emp {
    private String name;
    private int age;
    private double income;

    public Emp() {
    }

    public Emp(String name, int age, double income) {
        this.name = name;
        this.age = age;
        this.income = income;
    }

    @Override
    public String toString() {
        return "{" + name + ", " + age + ", " + income + '}';
    }
    
}
