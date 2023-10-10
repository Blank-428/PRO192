/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class MyList {
    private final ArrayList<Emp> t;

    public MyList() {
        t = new ArrayList<>();
    }

    public void clear() {
        t.clear();
    }
    
    public boolean isEmpty() {
        return (t.isEmpty());
    }
    
    public void add(Emp x) {
        t.add(x);
    }
    
    public void addMany(String[] a, int[] b, double[] c) {
        for (int i = 0; i < a.length; i++) {
            this.add(new Emp(a[i], b[i], c[i]));
        }
    }
    
    public void display() {
        for(Emp x: t) {
            System.out.println(x);
        }
    }
}
