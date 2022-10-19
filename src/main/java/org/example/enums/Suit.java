package org.example.enums;

public enum Suit {
    SPADES('S'),
    HEART('H'),
    DIAMON('D'),
    CLUB('C');

    final char suitCard;

    Suit(char suitCard){
        this.suitCard = suitCard;
    }

    public char getSuitCard() {
        return suitCard;
    }
}
