/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashset;

import java.io.*;
import java.util.*;

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
    
    void loadFile(String fname) throws IOException {
        FileReader fr = new FileReader(fname);
        BufferedReader br = new BufferedReader(fr);
        String s, xName; int xAge; double xIncome;
        String[] a;
        while (true) {
            s = br.readLine();
            if (s == null) {
                break;
            }
            s = s.trim();
            if (s.length() < 3) {
                break;
            }
            a = s.split("[|]");
            xName = a[0];
            xAge = Integer.parseInt(a[1].trim());
            xIncome = Double.parseDouble(a[2].trim());
            this.add(new Emp(xName, xAge, xIncome));
        }
        fr.close();
        br.close();
    }
    
    void saveToFile(String fname) throws IOException {
        FileWriter fw = new FileWriter(fname);
        PrintWriter pw = new PrintWriter(fw);
        for (Emp x: t) {
            pw.printf("%10s | %5d | %5.lf\r\n", x.getName(), x.getAge(), x.getIncome());
        }
        pw.close();
    }
    
    void removePos(int k) {
        if (k < 0 || k > t.size() - 1) return;
        t.remove(k);
    }
    
    int search(String xName) {
        for(int i = 0; i < t.size(); i++) {
            if (t.get(i).getName().equalsIgnoreCase(xName)) return i;
        }
        return -1;
    }
    
    void remove(String xName) {
        this.removePos(search(xName));
    }
    
    void sortByAgeName() {
        Collections.sort(t);
    }
}
