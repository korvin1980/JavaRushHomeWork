package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String pattern = "MM/dd/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern,Locale.ENGLISH);
        try{
            Date date = simpleDateFormat.parse(s);
            simpleDateFormat.applyPattern("MMM dd, yyyy");
            System.out.println(simpleDateFormat.format(date).toUpperCase());
        } catch (Exception e){
            System.out.println("entered date is not in "+pattern+" format!");
        }

    }
}
