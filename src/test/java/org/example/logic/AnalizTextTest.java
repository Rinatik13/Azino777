package org.example.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnalizTextTest extends AnalizText {

    String text = "AS 2D JH TC 3S";
    String text2 = "KS KH AH 2C TD";
    String text3 = "7D TS JC AH AD";
    String text4 = "AS KS QS JS TS";
    String text5 = "AS QS TS 9S 5S";
    String text6 = "7S 9H JC 8D TH";

    @Test
    public void testAnaliz() {
        String result = analiz(text);
        String exResult = null;
        assertNotEquals(exResult,result);
    }

    @Test
    public void testRoalFlash(){
        String result = analiz(text4);
        String exResult = "Рояль Флеш";
        assertEquals(exResult,result);
    }
}