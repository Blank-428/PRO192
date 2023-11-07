/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot3;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class IoData {
    public static void main(String args[]) {
        int a[];
        int n;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        n = Integer.parseInt(sc.nextLine());
        a = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("Enter the " + (i+1) + " /" + n + "element: ");
            a[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Entered values: ");
        for (i = 0; i < n; i++) {
            System.out.format("%5d", a[i]);
        }
        int s = 0;
        for (int x: a) s += x;
        System.out.println("\nSum of values: " + s);
    }
    
}
