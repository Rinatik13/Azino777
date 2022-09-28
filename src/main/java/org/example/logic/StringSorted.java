package org.example.logic;

import java.util.HashMap;
import java.util.Map;

public class StringSorted {
    Map<Character, Integer> map = new HashMap<>();
    public String startSorted(String text){
        createMap();
        String result = "";
        String[] textMap = text.split(" ");

        for (int y = 0; y < textMap.length-1; y++){
            for (int i = y; i < textMap.length-1; i++) {
                char charA = textMap[i].charAt(0);
                char charB = textMap[i + 1].charAt(0);
                int a = map.get(charA);
                int b = map.get(charB);
                if (a < b) {
                    String to = textMap[i];
                    textMap[i] = textMap[i + 1];
                    textMap[i + 1] = to;
                }
            }
            for (int i = textMap.length-1; i > 0; i--) {
                char charA = textMap[i].charAt(0);
                char charB = textMap[i - 1].charAt(0);
                int a = map.get(charA);
                int b = map.get(charB);
                if (a > b) {
                    String to = textMap[i];
                    textMap[i] = textMap[i - 1];
                    textMap[i - 1] = to;
                }
            }
        }
        for (int i = 0; i<textMap.length; i++){
            result += textMap[i];
            if (i == textMap.length-1){
                break;
            }
            else {
                result+= " ";
            }
        }
        return result;
    }


    public void createMap (){
        this.map.put('2',1);
        this.map.put('3',2);
        this.map.put('4',3);
        this.map.put('5',4);
        this.map.put('6',5);
        this.map.put('7',6);
        this.map.put('8',7);
        this.map.put('9',8);
        this.map.put('T',9);
        this.map.put('J',10);
        this.map.put('Q',11);
        this.map.put('K',12);
        this.map.put('A',13);
    }
}
