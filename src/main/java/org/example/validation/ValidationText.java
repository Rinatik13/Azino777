package org.example.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationText {
    String cart = "[AKQJT98765432]";
    String color = "[SHDC]";
    public boolean validRegex(String text){

        String[] carts = text.split(" ");
        if (equalsPattern(carts)){
            return equalsCarts(carts);
        }
        else{
            return false;
        }
    }

    private boolean equalsCarts(String[] carts){
        boolean result = true;
        for (int i = 0; i< carts.length-1; i++){
            for (int a = i+1; a < carts.length; a++){
                if (carts[i].equals(carts[a])) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    private boolean equalsPattern(String[] carts){
        Pattern patternCartEndColor = Pattern.compile(cart+color);
        if (carts.length!=5){
            return false;
        }
        for (String cartEndColor : carts){
            Matcher matcher = patternCartEndColor.matcher(cartEndColor);
            if (!matcher.find()){
                return false;
            }
        }
       return true;
    }
}
