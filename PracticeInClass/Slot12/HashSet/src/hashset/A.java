/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashset;
import java.util.*;
/**
 *
 * @author admin
 */
public class A implements Comparable {
    String name;
    int sal;

    public A() {
    }

    public A(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }

    @Override
    public boolean equals(Object x) {
        A y = (A) x;
        return (sal == y.sal);
    }
    
    @Override
    public int compareTo(Object x) {
        A y = (A) x;
        if (sal < y.sal) {
            return -1;
        }
        if (sal > y.sal) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return name + " " + sal;
    }
    
    
}