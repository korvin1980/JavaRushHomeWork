package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).
Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for(int i=0;i<32;i++)
        {
            alphabet.add( (char) ('а'+i));
        }
        alphabet.add(6,'ё');

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<10;i++)
        {
            String s = reader.readLine();
            list.add( s.toLowerCase());
        }


        //Напишите тут ваш код
        //подсчёт количества букв
        //создаём HashMap dlja hranenija rezul'tatov
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        for (Character c: alphabet){
            map.put(c, countOfCharInList(c, list));
        }

        printMap(map);
    }
    public static void printMap(LinkedHashMap<Character, Integer> map){
        for (Character key : map.keySet())
            System.out.println(key + " " + map.get(key));
    }
    public static int countOfCharInList(Character ch, ArrayList <String> list){
        int count=0;
        for (int i=0; i<list.size();i++)
        {
            String s = list.get(i);
            count += countOfCharInString(ch, s);
        }
        return count;
    }

    public static int countOfCharInString(Character c, String s){
        int count=0;
        for (int i=0; i< s.length();i++)
            if (c.equals(s.charAt(i)))
                count++;
        return count;
    }
}
