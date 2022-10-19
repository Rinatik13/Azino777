package org.example.enums;

public enum Card {
    ACE('A',12),
    KING('K',11),
    QUEEN('Q',10),
    JACK('J',9),
    TEN('T',8),
    NINE('9',7),
    EIGHT('8',6),
    SEVEN('7',5),
    SEX('6',4),
    FIVE('5',3),
    FOUR('4',2),
    THREE('3',1),
    TWO('2',0);

    final int cardStrength;

    final char textCardName;

    Suit suit;
    Card(char textCardName ,int cardStrength){
         this.cardStrength = cardStrength;
         this.textCardName = textCardName;
    }

    public int getCardStrength() {
        return cardStrength;
    }

    public char getTextCardName() {
        return textCardName;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "textCardName=" + textCardName +
                ", suit=" + suit.getSuitCard() +
                '}';
    }
}
