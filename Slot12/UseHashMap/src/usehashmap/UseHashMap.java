/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usehashmap;

import java.util.*;

/**
 *
 * @author admin
 */
public class UseHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap h = new HashMap();
        h.put("Sáu Tấn", "Huỳnh Anh Tuấn");
        h.put("Bình Gà", "Nguyễn Tấn Sầu");
        h.put("Ba Địa", "Trần Mai Hoà");
        System.out.println(h);
        
        h.put("Sáu Tấn", "Nguyễn Văn Tuấn");
        System.out.println(h);
        
        h.remove("Bình Gà");
        System.out.println(h);
        
        Iterator it = h.keySet().iterator();
        while (it.hasNext()) {
            String key = (String) (it.next());
            String value = (String) (h.get(key));
            System.out.println(key + ", " + value);
        }
    }
    
}
