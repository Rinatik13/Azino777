package org.example.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationText {
    public static boolean validRegex(String text){
        String[] textList = text.split(" ");
        String cart = "[AKQJT98765432]";
        String color = "[SHDC]";
        Pattern pattern = Pattern.compile("^"
                + cart + color
                +"\s"+ cart + color
                +"\s"+ cart + color
                +"\s"+ cart + color
                +"\s"+ cart + color
                +"$");
        Matcher matcher = pattern.matcher(text);
        // проверяем размер
        if (text.length()!=14){
            return false;
        }
        // проверяем шаблон
        else if (matcher.find()){
            // проверяем задвоения
            if (textList[0].equals(textList[1]) || textList[0].equals(textList[2]) || textList[0].equals(textList[3])
                    || textList[0].equals(textList[4])
            || textList[1].equals(textList[2]) || textList[1].equals(textList[3])
                    || textList[1].equals(textList[4])
                    || textList[2].equals(textList[3])
                    || textList[2].equals(textList[4])
                    || textList[3].equals(textList[4])
            ){
                return false;
            }
            else {
                return true;
            }
        }
        else{
            return false;
        }

    }
}
