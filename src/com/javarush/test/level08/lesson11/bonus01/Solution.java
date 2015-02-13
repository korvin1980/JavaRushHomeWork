package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //add your code here - напиши код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strMonth = reader.readLine();
        SimpleDateFormat format = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
        Date date = new Date(strMonth + "01 2015");

        System.out.println(strMonth + " is "+(date.getMonth()+1)+" month");
    }

}
