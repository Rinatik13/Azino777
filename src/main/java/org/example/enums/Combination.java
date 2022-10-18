package org.example.enums;

public enum Combination {
    ROYAL_FLUSH (9), // Роял Флеш
    STRAIGHT_FLUSH(8), // Стрит флеш
    FOUR_OF_A_KIND(7), // Каре
    FULL_HOUSE(6), // Фул хаус
    FLUSH(5), // Флеш
    STRAIGHT(4), // Стрит
    THREE_OF_A_KIND(3), // Тройка
    TWO_PAIR(2), // Две пары
    ONE_PAIR(1), // Пара
    HIGH_HAND(0); // Старшая карта

    final int strengthCombination;
    Combination(int strengthCombination){
        this.strengthCombination = strengthCombination;
    }

    public int getStrengthCombination() {
        return strengthCombination;
    }
}
