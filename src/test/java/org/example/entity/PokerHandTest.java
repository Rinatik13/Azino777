package org.example.entity;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        ArrayList<PokerHand> pokerHandList = new ArrayList<>();
        for (String text : list){
            PokerHand pokerHand = new PokerHand(text);
            pokerHandList.add(pokerHand);
        }
        Collections.sort(pokerHandList);
    }

    @Test (expected = Throwable.class)
    public void testException() {
        List<String> list = new ArrayList<>();
        list.add("2D 2S KH TC TH");
        list.add("7D 9H 2D 3F JS");
        list.add("AH AC AD 7D 7C");
        ArrayList<PokerHand> pokerHandList = new ArrayList<>();
        for (String text : list){
            PokerHand pokerHand = new PokerHand(text);
            pokerHandList.add(pokerHand);
        }
        Collections.sort(pokerHandList);
    }

    @Test (expected = Throwable.class)
    public void testException2() {
        List<String> list = new ArrayList<>();
        list.add("2D 2S KH TC TH");
        list.add("7D 9H 2D 2D JS");
        list.add("AH AC AD 7D 7C");
        ArrayList<PokerHand> pokerHandList = new ArrayList<>();
        for (String text : list){
            PokerHand pokerHand = new PokerHand(text);
            pokerHandList.add(pokerHand);
        }
        Collections.sort(pokerHandList);
    }
    @Test (expected = Throwable.class)
    public void testException3() {
        List<String> list = new ArrayList<>();
        list.add("12312123123123");
        list.add("7D 9H 2D 2S JS");
        list.add("AH AC AD 7D 7C");
        ArrayList<PokerHand> pokerHandList = new ArrayList<>();
        for (String text : list){
            PokerHand pokerHand = new PokerHand(text);
            pokerHandList.add(pokerHand);
        }
        Collections.sort(pokerHandList);
    }
}