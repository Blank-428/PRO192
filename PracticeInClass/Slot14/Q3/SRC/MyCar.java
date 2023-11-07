
import java.util.Collections;
import java.util.Comparator;
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
    @Override
    public int f1(List<Car> t) {
        if (t.size() == 0) {
            return 0;
        }
        int sum = 0;
        for (Car x: t) {
            sum += x.getRate();
        }
        return sum / t.size();
    }

    @Override
    public void f2(List<Car> t) {
        int max = t.get(0).getRate(), vtmax = 0;
        int min = t.get(0).getRate(), vtmin = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getRate() > max) {
                max = t.get(i).getRate();
                vtmax = i;
            }
            if (t.get(i).getRate() < min) {
                min = t.get(i).getRate();
                vtmin = i;
            }
        }
        Collections.swap(t, vtmax, vtmin);
    }

    @Override
    public void f3(List<Car> t) {
        Collections.sort(t, new Comparator<Car>() {
        @Override
        public int compare(Car o1, Car o2) {
            if (o1.getMaker().compareTo((o2.getMaker())) == 0) {
                return o1.getRate() > o2.getRate() ? -1 : 1;
            } 
            return o1.getMaker().compareTo((o2.getMaker()));
        }
    });
    }
}
