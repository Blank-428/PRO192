/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testenum;

import java.util.List;

/**
 *
 * @author admin
 */
public class ProductList implements IProductList {
    private List[] list;

    public ProductList() {
        
    }

    @Override
    public void addProduct() {
        System.out.println("Add a Product");
    }

    @Override
    public void removeProduct() {
        System.out.println("Remove a Product");
    }
    
}
