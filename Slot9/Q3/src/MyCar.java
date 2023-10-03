

import java.util.Collections;
import java.util.List;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class MyCar implements ICar {
    
    public int f1(List<Car> t) {
        int sum = 0;
        for (Car i: t) {
            sum += i.getRate();
        }
        return sum / t.size();
    }
    
    public void f2(List<Car> t) {
        int max = t.get(0).getRate();
        int vtMax = 0;
        for (int i = 0; i < t.size(); i++) {
            if (max < t.get(i).getRate()) {
                max = t.get(i).getRate();
                vtMax = i;
            }
        }
        
        int min = t.get(0).getRate();
        int vtMin = 0;
        for (int i = 0; i < t.size(); i++) {
            if (min > t.get(i).getRate()) {
                min = t.get(i).getRate();
                vtMin = i;
            }
        }
        
        Collections.swap(t, vtMax, vtMin);
    }
    
    public void f3(List<Car> t) {
        for(int i = 0; i < t.size() - 1; i++) {
            for (int j = i + 1; j < t.size(); j++) {
                if ((t.get(i).getMaker().compareTo(t.get(j).getMaker())) > 0) {
                    Collections.swap(t, i, j);
                }
                if ((t.get(i).getMaker().compareTo(t.get(j).getMaker())) == 0) {
                    if (t.get(i).getRate() < t.get(j).getRate()) {
                        Collections.swap(t, i, j);
                    }
                }
            }
        }
    }
}
