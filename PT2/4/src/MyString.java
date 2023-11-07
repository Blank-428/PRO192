
import java.util.Arrays;

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

    @Override
    public int f1(String str) {
        String[] stringArray = str.split("\\s+");
        int sumOfLengthOfWords = 0;
        for (String string : stringArray) {
            if (!checkPalimdrome(string)) {
                sumOfLengthOfWords += string.length();
            }
        }
        return sumOfLengthOfWords;
    }
    
    private boolean checkPalimdrome(String str) {
        if (str.length() < 2) {
            return true;
        }
        char[] temp = str.toCharArray();
        int countChars = temp.length - 1;
        for (int i = 0; i < countChars / 2; i++) {
            if (temp[i] != temp[countChars-i]) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public String f2(String str) {
        char[] strChars = str.toCharArray();
        String result = "";
        for (char strChar : strChars) {
            String temp = "";
            temp += strChar;
            if (!(result.contains(temp))) {
                result += temp;
            }
        }
        return result;
    }
}
