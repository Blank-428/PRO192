/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petersonnumber;

/**
 *
 * @author admin
 */
public class PetersonNumber {

    /**
     * @param args the command line arguments
     */
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n-1);
    }
    public static int petersonSum(int n) {
        if (n < 10) return factorial(n);
        return factorial(n%10) + petersonSum(n/10);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (i == petersonSum(i)) {
                System.out.println(i);
            }
        }
    }   
}
