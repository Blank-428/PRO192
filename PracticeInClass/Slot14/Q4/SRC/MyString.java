
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class MyString implements IString {
    
    public boolean isPrime(char[] prime, char input) {
        for (char c : prime) {
            if (c == input) return true;
        }
        return false;
    }
    
    @Override
    public int f1(String str) {
        int count = 0;
        char[] prime = {'2', '3', '5', '7'};
        char[] temp = str.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            if (isPrime(prime, temp[i])) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        String[] word = str.split(" ");
        String result = "";
        for (int i = word.length-1; i >= 0; i--) {
            result = result.concat(word[i]);
            if (i != 0) {
                result = result.concat(" ");
            }
        }
        result = result.trim();
        return result;
    }
    
}
