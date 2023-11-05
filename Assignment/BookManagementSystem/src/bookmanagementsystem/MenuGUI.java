/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookmanagementsystem;
/**
 *
 * @author admin
 */
public class MenuGUI {
    public static int getChoiceFromKeyBoard() {
        for (MenuOptions option : MenuOptions.values()) {
            if (option != MenuOptions.INVALID_OPTION) {
                System.out.println(option.toString());
            }
        }
        String messageGetChoice = "   Your selection (0 -> 8): ";
        return GetValues.getIntValue(messageGetChoice);
    }
}
