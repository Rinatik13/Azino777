package org.example.logic;

import org.example.enums.Card;
import org.example.enums.Suit;

import java.util.HashMap;
import java.util.Map;

public class StringSorted {
    Card[] cards = new Card[5];

    Map<Character, Integer> map = new HashMap<>();
    public Card[] getSortedCards(String text){
        separationCard(text);
        comparisonCart();
        return cards;
    }

    public void createCard(){
        Card[] cards = new Card[5];
        cards[0] = Card.ACE;
        System.out.println(cards[0]);
    }

    public void separationCard(String text){
        String[] arrayCard = text.split(" ");
        for(int i = 0; i<cards.length; i++){
            cards[i] = getCard(arrayCard[i].charAt(0),arrayCard[i].charAt(1));
        }
    }

    public void comparisonCart(){
        int step = 0;
        while (step<5){
            for (int i = 0; i<4; i++){
                if (cards[i].getCardStrength()<cards[i+1].getCardStrength()){
                    Card card = cards[i];
                    cards[i]=cards[i+1];
                    cards[i+1] = card;
                }
            }
            step++;
        }

    }

    public Card getCard (char charText, char charTextSuit){
        Card cardResult = switch (charText) {
            case ('A') -> Card.ACE;
            case ('K') -> Card.KING;
            case ('Q') -> Card.QUEEN;
            case ('J') -> Card.JACK;
            case ('T') -> Card.TEN;
            case ('9') -> Card.NINE;
            case ('8') -> Card.EIGHT;
            case ('7') -> Card.SEVEN;
            case ('6') -> Card.SEX;
            case ('5') -> Card.FIVE;
            case ('4') -> Card.FOUR;
            case ('3') -> Card.THREE;
            case ('2') -> Card.TWO;
            default -> null;
        };
        cardResult.setSuit(getSuit(charTextSuit));
        return cardResult;
    }
// проблема с сортировкой одинаковых карт с разнымы мастями.
    public Suit getSuit(char charTextSuit){
        return switch (charTextSuit) {
            case ('S') -> Suit.SPADES;
            case ('H') -> Suit.HEART;
            case ('D') -> Suit.DIAMON;
            case ('C') -> Suit.CLUB;
            default -> null;
        };
    }
}
