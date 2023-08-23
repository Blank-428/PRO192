/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshop2;
import java.util.Scanner;
public class Part2_2 {
    public static boolean checkString(String st) throws Exception {
        String pattern = "SE(.*)";
        if (!(st.matches(pattern))) {
            throw new Exception();
        }
        return true;
    }
    public static void main(String[] args) {
        boolean cont = false;
        String st;
        do {
            try {
                System.out.println("Enter the string: ");
                Scanner sc = new Scanner(System.in);
                st = sc.nextLine();
                if (checkString(st)) {
                    System.out.println("The string is: " + st);
                    cont = false;
                }
            } catch (Exception e) {
                System.out.println("The string is invalid");
                cont = true;
            }
        } while (cont);
    }
}
