/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciseinclass;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array");
        int n = Integer.parseInt(sc.nextLine());
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter a[" + i + "] = ");
            a[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("The array is: ");
        for(int num:a) {
            System.out.print(num + " ");
        }
        System.out.println("");
        System.out.println("The sorted array is: ");
        Arrays.sort(a);
        for(int num:a) {
            System.out.print(num + " ");
        }
        System.out.println("");
        int max = a[0];
        for(int num:a) {
            if (num > max) max = num;
        }
        System.out.println("The maximum of array: " + max);
    }
}
