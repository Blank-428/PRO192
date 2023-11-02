/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortdemo;
import java.lang.Comparable;
import java.util.Comparator;
/**
 *
 * @author admin
 */
public class Employee implements Comparable {
    private String ID;
    private String name;
    private int salary;

    public Employee(String ID, String name, int salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return ID + ", " + name + ", " + salary ;
    }

    @Override
    public int compareTo(Object o) {
        return ID.compareTo(((Employee) o).ID);
    }
    
    public static Comparator comparaObj = (Comparator) (Object o1, Object o2) -> {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        int d = e1.salary - e2.salary;
        if (d > 0) return -1;
        if (d == 0) return (e1.ID.compareTo(e2.ID) == 0) ? -1 : 1;
        return 1;
    };
}
