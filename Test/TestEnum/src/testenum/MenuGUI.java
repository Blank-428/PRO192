/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testenum;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class MenuGUI {
    public static int getChoiceFromKeyBoard() {
        for (MenuOptions option : MenuOptions.values()) {
            System.out.println(option.getValue() + ", " + option.getLabel());
        }
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }
}
