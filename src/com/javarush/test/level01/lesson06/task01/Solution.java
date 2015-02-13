package com.javarush.test.level01.lesson06.task01;


import java.io.IOException;

public class Solution
{


    public static void main(String[] args) throws IOException    {
        //написать тут ваш код
        int[] iArr = {800, 1500, 2200, 2700, 3200};
        String[] sYears = {"в первый", "во второй", "в третий", "в четвертый", "в пятый"};
        System.out.println("Меня зовут Амиго.");
        System.out.println();
        for (int i = 0; i < iArr.length; i++)
            System.out.println("Я согласен на зарплату $" + iArr[i] + "/месяц " + sYears[i] + " год.");
        System.out.println("Поцелуй мой блестящий металлический зад!");


    }
///**/



}