package com.javarush.test.level08.lesson11.home09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
    если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)throws ParseException
    {
        System.out.println(isDateOdd("JANUARY 1 2015"));
        System.out.println(isDateOdd("JANUARY 2 2020"));
        System.out.println(isDateOdd("JANUARY 5 1980"));
    }

    public static boolean isDateOdd(String input)throws ParseException
    {

        SimpleDateFormat format = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
        Date dateNow = new Date(input);
        Date yearBegin = new Date(dateNow.getYear(),0,1);


        long difference = dateNow.getTime()  - yearBegin.getTime();
        long days = (difference/(24*60*60*1000))+1;
        int iDays=(int)days;



        //System.out.println(format.format(yearBegin));
        //System.out.println(format.format(dateNow));
        return(iDays % 2 != 0);
    }
}
