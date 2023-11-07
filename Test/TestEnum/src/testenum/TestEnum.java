/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testenum;

/**
 *
 * @author admin
 */
public class TestEnum {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        ProductList productList = new ProductList();
        int choice = MenuGUI.getChoiceFromKeyBoard();
        MenuOptions option = MenuOptions.getOptionByValue(choice);
        option.toString();
        switch (option) {
            case MONDAY: {
                productList.addProduct();
                break;
            }
            case TUESDAY: {
                productList.removeProduct();
                break;
            }
        }
    }
}
