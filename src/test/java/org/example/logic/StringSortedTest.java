package org.example.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringSortedTest extends StringSorted {

    String text = "AS 2D JH TC 3S";
    String text2 = "KS KH AH 2C TD";
    String text3 = "7D TS JC AH AD";

    @Test
    public void testStart() {
        getSortedCards(text);
    }

    @Test
    public void testReturn(){
        String result = null;
        result = getSortedCards(text);
        assertNotEquals(null,result);
    }

    @Test
    public void testSorted(){
        String exResult = "AS JH TC 3S 2D";
        String result = getSortedCards(text);
        assertEquals(exResult,result);
    }

    @Test
    public void testSorted2(){
        String exResult = "AH KS KH TD 2C";
        String result = getSortedCards(text2);
        assertEquals(exResult,result);
    }

    @Test
    public void testSorted3(){
        String exResult = "AH AD JC TS 7D";
        String result = getSortedCards(text3);
        assertEquals(exResult,result);
    }

}