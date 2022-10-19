package org.example;

import org.example.enums.Card;
import org.example.enums.Suit;
import org.example.logic.StringSorted;

public class Main {
    public static void main(String[] args) {
        Card[] cards = new Card[5];

        String text = "AS 2D JH TC 3S";
        String text2 = "KS KH AH 2C TD";
        String text3 = "7D TS JC AH AD";

        StringSorted stringSorted = new StringSorted();
        cards = stringSorted.getSortedCards(text3);
        for (int i= 0 ; i<cards.length; i++){
            System.out.println(cards[i].toString());
        }
    }
}
