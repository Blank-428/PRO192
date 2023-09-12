/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labarray;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

import static java.lang.Math.abs;

/**
 *
 * @author admin
 */
public class LabArray {

    /**
     * @param args the command line arguments
     */
    
    static float avgArray(int a[]) {
        int sum = 0;
        for(int x:a) {
            sum += x;
        }
        float avg = (float) sum / a.length;
        return avg;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = parseInt(sc.nextLine());
        }
        float avg = avgArray(a);
        float minNearest = (float) abs(a[0] - avg);
        int point = a[0], index = 0;
        for (int i = 0; i< a.length; i++) {
            float temp = (float) abs(a[i] - avg);
            if (minNearest > temp) {
                minNearest = temp;
                point = a[i];
                index = i;
            }
        }
        System.out.println(point + " " + index);
        sc.close();
    }
    
}
