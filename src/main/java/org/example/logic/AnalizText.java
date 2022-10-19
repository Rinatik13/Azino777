package org.example.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalizText {

    Map<Character, Integer> map = new HashMap<>();
    private List<String> kiker = new ArrayList<>();
    private List<Integer> kikers = new ArrayList<>();

    public int analiz(String text) {
        StringSorted stringSorted = new StringSorted();
//        text = stringSorted.getSortedCards(text);
        createMap();
        int result = 0;

        String[] listText = text.split(" ");
        // проверяем это рояль флеш или нет
        for (int i = 0; i < listText.length - 1; i++) {
            char a1 = listText[0].charAt(0);
            int a = map.get(listText[i].charAt(0));
            int b = map.get(listText[i + 1].charAt(0));

            char aX = listText[i].charAt(1);
            char bY = listText[i + 1].charAt(1);

            if (a == b + 1 && a1 == 'A') {
                if (aX == bY) {
                    result = 9;
                } else {
                    result = 0;
                    break;
                }
            } else {
                result = 0;
                break;
            }
        }

        //проверяем является ли это флеш или нет
        if (result==0) {

            for (int i = 0; i < listText.length - 1; i++) {
                int a = map.get(listText[i].charAt(0));
                int b = map.get(listText[i + 1].charAt(0));

                char aX = listText[i].charAt(1);
                char bY = listText[i + 1].charAt(1);

                if (a == b + 1) {
                    if (aX == bY) {
                        result = 8;
                    } else {
                        result = 0;
                        break;
                    }
                } else {
                    result = 0;
                    break;
                }
            }
        }

        // проверяем является ли текст каре или нет
        if (result==0) {
            String a,b,c,d,f;

            a = String.valueOf(listText[0].charAt(0));
            b = String.valueOf(listText[1].charAt(0));
            c = String.valueOf(listText[2].charAt(0));
            d = String.valueOf(listText[3].charAt(0));
            f = String.valueOf(listText[4].charAt(0));
            if (a.equals(b) && a.equals(c) && a.equals(d)){
                result = 7;
            }
            else if (b.equals(c) && b.equals(d) && d.equals(f)){
                result = 7;
            }

        }

        // проверяем фулл хаус

        if (result==0){
            String a,b,c,d,f;

            a = String.valueOf(listText[0].charAt(0));
            b = String.valueOf(listText[1].charAt(0));
            c = String.valueOf(listText[2].charAt(0));
            d = String.valueOf(listText[3].charAt(0));
            f = String.valueOf(listText[4].charAt(0));

            if (a.equals(b) && a.equals(c) && d.equals(f)){
                kiker.add(a);
                kiker.add(b);
                kiker.add(c);
                kiker.add(d);
                kiker.add(f);
                result = 6;
            }
            else if (a.equals(b)&&c.equals(d)&&c.equals(f)){
                kiker.add(a);
                kiker.add(b);
                kiker.add(c);
                kiker.add(d);
                kiker.add(f);
                result = 6;
            }

        }

        // проверяем флеш

        if (result==0){
            String a,b,c,d,f;

            a = String.valueOf(listText[0].charAt(1));
            b = String.valueOf(listText[1].charAt(1));
            c = String.valueOf(listText[2].charAt(1));
            d = String.valueOf(listText[3].charAt(1));
            f = String.valueOf(listText[4].charAt(1));
            if (a.equals(b)&&a.equals(c)&&a.equals(d)&&a.equals(f)){
                kiker.add(a);
                kiker.add(b);
                kiker.add(c);
                kiker.add(d);
                kiker.add(f);
                result = 5;
            }

        }

        // проверяем соответствию стрит
        if (result==0){
            int a,b,c,d,f;

            a = map.get(listText[0].charAt(0));
            b = map.get(listText[1].charAt(0));
            c = map.get(listText[2].charAt(0));
            d = map.get(listText[3].charAt(0));
            f = map.get(listText[4].charAt(0));
            if (a==b+1 && b==c+1 && c==d+1 && d==f+1){
                result = 4;
            }

        }

        // проверяем сет

        if (result==0) {
            String a, b, c, d, f;

            a = String.valueOf(listText[0].charAt(0));
            b = String.valueOf(listText[1].charAt(0));
            c = String.valueOf(listText[2].charAt(0));
            d = String.valueOf(listText[3].charAt(0));
            f = String.valueOf(listText[4].charAt(0));

            if (a.equals(b) && a.equals(c)) {
                kiker.add(d);
                kiker.add(f);
                result = 3;
            } else if (b.equals(c)&&b.equals(d)){
                kiker.add(a);
                kiker.add(f);
                result = 3;
            }
            else if(c.equals(d)&&c.equals(f)){
                kiker.add(a);
                kiker.add(b);
                result = 3;
            }

        }

        // проверяем две одинаковых пары
        if (result==0){
            String a, b, c, d, f;

            a = String.valueOf(listText[0].charAt(0));
            b = String.valueOf(listText[1].charAt(0));
            c = String.valueOf(listText[2].charAt(0));
            d = String.valueOf(listText[3].charAt(0));
            f = String.valueOf(listText[4].charAt(0));

            if (a.equals(b) && c.equals(d)){
                kiker.add(f);
                result = 2;
            }
            else if(b.equals(c) && d.equals(f)){
                kiker.add(a);
                result = 2;
            }
            else if (a.equals(b) && d.equals(f)){
                kiker.add(c);
                result = 2;
            }

        }

        // проверка на пару
        if (result==0){
            String a, b, c, d, f;

            a = String.valueOf(listText[0].charAt(0));
            b = String.valueOf(listText[1].charAt(0));
            c = String.valueOf(listText[2].charAt(0));
            d = String.valueOf(listText[3].charAt(0));
            f = String.valueOf(listText[4].charAt(0));

            if (a.equals(b)){
                kiker.add(c);
                kiker.add(d);
                kiker.add(f);
                result = 1;
            }
            else if(b.equals(c)) {
                kiker.add(a);
                kiker.add(d);
                kiker.add(f);
                result = 1;
            }
            else if (c.equals(d)){
                kiker.add(a);
                kiker.add(b);
                kiker.add(f);
                result = 1;
            }
            else if (d.equals(f)) {
                kiker.add(a);
                kiker.add(b);
                kiker.add(c);
                result = 1;
                }
            }
        if (result==0){
            String a, b, c, d, f;

            a = String.valueOf(listText[0].charAt(0));
            b = String.valueOf(listText[1].charAt(0));
            c = String.valueOf(listText[2].charAt(0));
            d = String.valueOf(listText[3].charAt(0));
            f = String.valueOf(listText[4].charAt(0));
            kiker.add(a);
            kiker.add(b);
            kiker.add(c);
            kiker.add(d);
            kiker.add(f);
        }
        for (String string : kiker){
            kikers.add(map.get(string.charAt(0)));
        }
        return result;
    }

    public int analizCart(String text){
        StringSorted stringSorted = new StringSorted();
//        text = stringSorted.getSortedCards(text);
        createMap();
        String[] listText = text.split(" ");
        int a,b,c,d,f;
        a = map.get(listText[0].charAt(0));
        b = map.get(listText[1].charAt(0));
        c = map.get(listText[2].charAt(0));
        d = map.get(listText[3].charAt(0));
        f = map.get(listText[4].charAt(0));
        return a+b+c+d+f;
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

    public List<String> getKiker() {
        return this.kiker;
    }

    public List<Integer> getKikers() {
        return kikers;
    }
}
