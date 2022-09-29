package org.example.validation;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidationTextTest extends ValidationText {

    @Test
    public void testValidRegex() {
        String text = "AH AS AD AC 2D";
        boolean result = validRegex(text);
        boolean exResult = true;
        assertEquals(exResult,result);
    }

    @Test
    public void testValidRegex2() {
        String text = "AH AS AD AC";
        boolean result = validRegex(text);
        boolean exResult = true;
        assertNotEquals(exResult,result);
    }
    @Test
    public void testValidRegex3() {
        String text = "AH AS AD AC 2D 4H";
        boolean result = validRegex(text);
        boolean exResult = true;
        assertNotEquals(exResult,result);
    }

    @Test
    public void testValidRegex4() {
        String text = "AH AS AD AC 2G";
        boolean result = validRegex(text);
        boolean exResult = false;
        assertEquals(exResult,result);
    }
    @Test
    public void testValidRegex5() {
        String text = "asdasd";
        boolean result = validRegex(text);
        boolean exResult = false;
        assertEquals(exResult,result);
    }
    @Test
    public void testValidDublicate(){
        String text = "AH AH AH AH AH";
        boolean result = validRegex(text);
        boolean exResult = false;
        assertEquals(exResult,result);
    }
    @Test
    public void testValidDublicate2(){
        String text = "AH  H A  A  AH";
        boolean result = validRegex(text);
        boolean exResult = false;
        assertEquals(exResult,result);
    }

    @Test
    public void testValidDublicate3(){
        String text = "AS AH AH AH AH";
        boolean result = validRegex(text);
        boolean exResult = false;
        assertEquals(exResult,result);
    }
    @Test
    public void testValidDublicate4(){
        String text = "AS AH 9C TC TC";
        boolean result = validRegex(text);
        boolean exResult = false;
        assertEquals(exResult,result);
    }
    @Test
    public void testValidDublicate5(){
        String text = "AS AH AD AH AD";
        boolean result = validRegex(text);
        boolean exResult = false;
        assertEquals(exResult,result);
    }
    @Test
    public void testValidDublicate6(){
        String text = "AS AH TC AH TC";
        boolean result = validRegex(text);
        boolean exResult = false;
        assertEquals(exResult,result);
    }
}