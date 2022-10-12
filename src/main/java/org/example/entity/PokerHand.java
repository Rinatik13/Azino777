package org.example.entity;

import org.example.logic.AnalizText;
import org.example.validation.ValidationText;

import java.util.ArrayList;
import java.util.List;

public class PokerHand implements Comparable<PokerHand>{
    String text;
    List<Integer> kiker = new ArrayList<>();

    public PokerHand() {
    }

    public PokerHand(String text) {
        ValidationText validationText = new ValidationText();
        if (validationText.validRegex(text)){
            AnalizText analizText = new AnalizText();
            int i = analizText.analiz(text);
            this.kiker = analizText.getKikers();
            this.text = text;
        }
        else {
            throw new RuntimeException("Текст не соответствует шаблону.");
        }
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public int compareTo(PokerHand o) {
        AnalizText analizText = new AnalizText();
        int a = analizText.analiz(this.text);
        int b = analizText.analiz(o.text);
        int result = 0;

        if (a == b) {
            // сравниваем кикеры
            for (int i = 0; i < this.kiker.size(); i++) {
                int cartA = this.kiker.get(i);
                int cartB = o.kiker.get(i);

                if (cartA>cartB){
                    result = -1;
                    break;
                }
                else if (cartA<cartB){
                    result = 1;
                    break;
                } else {
                    result = 0;
                }
            }
        }
        else if (a > b){
            result = -1;
        }
        else{
            result = 1;
        }
        return  result;
    }


    @Override
    public String toString() {
        AnalizText analizText = new AnalizText();
        return "\nPokerHand{" +
                "text='" + text + '\'' +
                '}' + "Ruka: ";
    }
}
