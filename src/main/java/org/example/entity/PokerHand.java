package org.example.entity;

import org.example.logic.AnalizText;

public class PokerHand implements Comparable<PokerHand>{
    String text;

    public PokerHand() {
    }

    public PokerHand(String text) {
        this.text = text;
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
        if (a == b) {
            // если сила руки равны то проверяем по кикеру. наибольшей карте. простая схема это проверка по сумме карт
            int cartA = analizText.analizCart(this.text);
            int cartB = analizText.analizCart(text);
            if (cartA == cartB){
                return 0;
            }
            else if(cartA > cartB){
                return -1;
            }
            else {
                return 1;
            }
        } else if (a > b) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        AnalizText analizText = new AnalizText();
        return "\nPokerHand{" +
                "text='" + text + '\'' +
                '}' + "Ruka: " + analizText.analiz(text) + ",Kiker: " + analizText.analizCart(text);
    }
}
