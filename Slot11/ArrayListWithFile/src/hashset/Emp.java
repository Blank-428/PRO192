/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashset;

/**
 *
 * @author admin
 */
public class Emp implements Comparable<Emp> {
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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getIncome() {
        return income;
    }
    
    

    @Override
    public String toString() {
        return "{" + name + ", " + age + ", " + income + '}';
    }
    
    @Override
    public int compareTo(Emp x) {
        if (age < x.age) {
            return -1;
        } else {
            if (age == x.age) {
                return (name.compareTo(x.name));
            }
        }
        return 1;
    }
}
