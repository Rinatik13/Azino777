package org.example.logic;

import java.util.HashMap;
import java.util.Map;

public class AnalizText {

    Map<Character, Integer> map = new HashMap<>();
    public String analiz(String text){
        createMap();
        String result = "";
        String[]listText = text.split(" ");
        // проверяем это рояль флеш
//        char a = listText[0].charAt(0);
//        char b = listText[0].charAt(1);
//
//        char aX = listText[1].charAt(0);
//        char bX = listText[1].charAt(1);
        for (int i = 0; i< listText.length-1;i++){
            int a = map.get(listText[i].charAt(0));
            int b = map.get(listText[i+1].charAt(0));

            char aX = listText[i].charAt(1);
            char bY = listText[i+1].charAt(1);

            if (a==b+1){
                if (aX==bY){
                    result = "Рояль Флеш";
                }
                else {
                    result = "Не рояль флеш";
                    break;
                }
            }
            else {
                result = "Не рояль флеш";
                break;
            }
        }
        System.out.println(result);
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
