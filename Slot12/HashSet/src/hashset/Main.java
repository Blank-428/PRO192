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
public class Main {
    public static void main(String[] args) throws Exception {
        String[] a = {"Hung", "Lan", "Ngo", "Khoai", "San"};
        int[] p = {22, 18, 15, 11, 7};
        int n = 5;
        MySet t = new MySet();
        t.addMany(a, p, n);
        t.display();
        A x = new A("ABC", 15);
        t.add(x);
        t.display();
       
    }
}
