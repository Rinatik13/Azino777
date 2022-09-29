package org.example.entity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class PokerHandTest extends PokerHand {

    @Test
    public void testCompareTo() {
        List<String> list = new ArrayList<>();
        list.add("2D 2S KH TC TH");
        list.add("7D 9H 2D 3C JS");
        list.add("AH AC AD 7D 7C");
        list.add("AH AC AD KD KS");
        list.add("2D 2S 3C 2H 2C");
        list.add("2D 2H QS JS TH");
        list.add("2S 2C KS 3D 7D");
        list.add("8C 7S 2D 3H 5S");
        list.add("TC 7D 9H 8S JS");
        list.add("QH JH TH 9H 8H");
        list.add("AS KS QS JS TS");
        list.add("2A 3A 4A 5A 6A");
        ArrayList<PokerHand> pokerHandList = new ArrayList<>();
        for (String text : list){
            PokerHand pokerHand = new PokerHand(text);
            pokerHandList.add(pokerHand);
        }
        System.out.println("Result do" + pokerHandList);
        Collections.sort(pokerHandList);
        System.out.println("Result posle" + pokerHandList);
    }
}