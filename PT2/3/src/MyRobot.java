
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
public class MyRobot extends Robot implements IRobot {

    @Override
    public int f1(List<Robot> t) {
        int sum = 0;
        sum = t.stream().filter((robot) -> (!(robot.getLabel().contains("A")) && !(robot.getLabel().contains("B")))).map((robot) -> robot.getStep()).reduce(sum, Integer::sum);
        return sum;
    }

    @Override
    public void f2(List<Robot> t) {
        int max = 0, vtMax = 0;
        for (int i = 0; i < t.size(); i++) {
            if (max < t.get(i).getStep()) {
                max = t.get(i).getStep();
                vtMax = i;
            }
        }
        t.remove(vtMax);
    }

    @Override
    public void f3(List<Robot> t) {
        int left = 0, right = 0;
        for (int i = 0; i < t.size()-1; i++) {
            for (int j = i+1; j < t.size(); j++) {
                if (t.get(i).getStep() == t.get(j).getStep()) {
                    left = i;
                    right = j;
                }
            }
        }
        List temp = t.subList(left, right);
        Collections.sort(temp, new Comparator<Robot>() {
            @Override
            public int compare(Robot o1, Robot o2) {
                if (o1.getStep() == o2.getStep()) {
                    return (o1.getLabel().equalsIgnoreCase(o2.getLabel())) ? -1: 1;
                }
                return o1.getStep() < o2.getStep() ? -1: 1;
            }
        });
    } 
}
