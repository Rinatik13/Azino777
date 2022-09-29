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
    String text7 = "JS KS TS QS AS";
    String text8 = "7S 6S 8S TS 9S";
    String textCare = "4S AS AD AH AC";
    String textFullHause = "TD TC TH 9C 9D";
    String textFullHause2 = "KC KS 2D 2C 2H";
    String textFlash = "2S 5S KS TS 8S";
    String textFlash2 = "2D QD JD 5D TD";
    String textStrit ="2D 5C 3H 4S 6D";
    String textStrin2 = "4S 7H 5D 6C 8D";
    String textSet1 = "4H 5S 4C KS 4D";
    String textSet2 = "7D TH 7C AD 7S";
    String textSet3 = "QH KH JS QC QS";
    String textTwoCouples1 = "JS 2D KH 2C JD";
    String textTwoCouples2 = "3S 3D AH TD TC";
    String textTwoCouples3 = "AH TH TS AS KD";
    String textPair1 = "2D 3S 5C 2S KH";
    String textPair2 = "KS JD AC AH 2D";
    String textPair3 = "QH AS QS 2D 3H";
    String textA = "2D 4C 6H AC JS";
    String textK = "3H 5C KS JH TD";
    String textQ = "2S 5H TD QS 3D";
    String textJ = "2C 3D TD 6C JS";
    String textT = "4C 2D TH 3S 9H";


    @Test
    public void testAnaliz() {
        int result = analiz(text);
        int exResult = 0;
        assertEquals(exResult,result);
    }

    @Test
    public void testRoalFlash(){
        int result = analiz(text4);
        int exResult = 9;
        assertEquals(exResult,result);
    }

    @Test
    public void testRoalFlash2(){
        int result = analiz(text7);
        int exResult = 9;
        assertEquals(exResult,result);
    }

    @Test
    public void testNoRoalFlash(){
        int result = analiz(text);
        int exResult = 9;
        assertNotEquals(exResult,result);
    }
    @Test
    public void testNoRoalFlash2(){
        int result = analiz(text2);
        int exResult = 9;
        assertNotEquals(exResult,result);
    }

    @Test
    public void textStritFlash(){
        int result = analiz(text8);
        int exResult = 8;
        assertEquals(exResult,result);
    }

    @Test
    public void textNoStritFlash(){
        int result = analiz(text);
        int exResult = 8;
        assertNotEquals(exResult,result);
    }
    @Test
    public void textNoStritFlash2(){
        int result = analiz(text5);
        int exResult = 8;
        assertNotEquals(exResult,result);
    }
    @Test
    public void textNoStritFlash3(){
        int result = analiz(text4);
        int exResult = 8;
        assertNotEquals(exResult,result);
    }
    @Test
    public void textCare(){
        int result = analiz(textCare);
        int exResult = 7;
        assertEquals(exResult,result);
    }
    @Test
    public void textFullHause(){
        int result = analiz(textFullHause);
        int exResult = 6;
        assertEquals(exResult,result);
    }

    @Test
    public void textFullHause2(){
        int result = analiz(textFullHause2);
        int exResult = 6;
        assertEquals(exResult,result);
    }

    @Test
    public void textFlash(){
        int result = analiz(textFlash);
        int exResult = 5;
        assertEquals(exResult,result);
    }

    @Test
    public void textFlash2(){
        int result = analiz(textFlash2);
        int exResult = 5;
        assertEquals(exResult,result);
    }

    @Test
    public void textStrit(){
        int result = analiz(text6);
        int exResult = 4;
        assertEquals(exResult,result);
    }
    @Test
    public void textStrit2(){
        int result = analiz(textStrin2);
        int exResult = 4;
        assertEquals(exResult,result);
    }
    @Test
    public void textStrit3(){
        int result = analiz(textStrit);
        int exResult = 4;
        assertEquals(exResult,result);
    }

    @Test
    public void textSet(){
        int result = analiz(textSet1);
        int exResult = 3;
        assertEquals(exResult,result);
    }
    @Test
    public void textSet2(){
        int result = analiz(textSet2);
        int exResult = 3;
        assertEquals(exResult,result);
    }
    @Test
    public void textSet3(){
        int result = analiz(textSet3);
        int exResult = 3;
        assertEquals(exResult,result);
    }

    @Test
    public void textTwoCouples1(){
        int result = analiz(textTwoCouples1);
        int exResult = 2;
        assertEquals(exResult,result);
    }

    @Test
    public void textTwoCouples2(){
        int result = analiz(textTwoCouples2);
        int exResult = 2;
        assertEquals(exResult,result);
    }

    @Test
    public void textTwoCouples3(){
        int result = analiz(textTwoCouples3);
        int exResult = 2;
        assertEquals(exResult,result);
    }

    @Test
    public void textPair1() {
        int result = analiz(textPair1);
        int exResult = 1;
        assertEquals(exResult, result);
    }

    @Test
    public void textPair2() {
        int result = analiz(textPair2);
        int exResult = 1;
        assertEquals(exResult, result);
    }

    @Test
    public void textPair3() {
        int result = analiz(textPair3);
        int exResult = 1;
        assertEquals(exResult, result);
    }

    @Test
    public void textPair4(){
        int result = analiz(text3);
        int exResult =1;
        assertEquals(exResult,result);
    }

    @Test
    public void textA() {
        int result = analiz(textA);
        int exResult = 0;
        assertEquals(exResult, result);
    }
    @Test
    public void textK() {
        int result = analiz(textK);
        int exResult = 0;
        assertEquals(exResult, result);
    }
    @Test
    public void textQ() {
        int result = analiz(textQ);
        int exResult = 0;
        assertEquals(exResult, result);
    }
    @Test
    public void textJ() {
        int result = analiz(textJ);
        int exResult = 0;
        assertEquals(exResult, result);
    }
    @Test
    public void textT() {
        int result = analiz(textT);
        int exResult = 0;
        assertEquals(exResult, result);
    }
}