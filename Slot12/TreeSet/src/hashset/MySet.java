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
public class MySet extends TreeSet {
    @Override
    public boolean isEmpty() {
        return (super.isEmpty());
    }
    
    void add(A x) {
        super.add(x);
    }
    
    void addMany(String[] a, int[] p, int n) {
        A x;
        for (int i = 0; i < n; i++) {
            x = new A(a[i], p[i]);
            add(x);
        }
    }
    
    void display() {
        System.out.println("The elemants of the list");
        Iterator h = iterator();
        while (h.hasNext()) {
            System.out.println(h.next());
        }
    }
}
