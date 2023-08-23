/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshop1;
import java.util.Scanner;
public class Part3 {
    public static String upperCaseFirst(String value) {
        
        // Convert String to char array.
        char[] array = value.toCharArray();
        // Modify first element in array.
        array[0] = Character.toUpperCase(array[0]);
        // Return string.
        return new String(array);
    }
    public static void main (String[] args) {
        String[] list = new String[10];
        for(int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            list[i] = sc.nextLine();
        }
        for(int i = 0 ; i < 10 ; i++){
           list[i] = upperCaseFirst(list[i]);
        }
        for(int i = 0; i < 10; i++) {
            System.out.println(list[i]);
        }
    }
}
