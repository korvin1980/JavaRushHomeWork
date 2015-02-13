package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.
*/

import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        public String name, profession, address;
        public int weight;
        public boolean sex;
        public Date birthDay;

        public Human(String name){this.name=name;}
        public Human(String name, String profession){this.name=name; this.profession=profession;}
        public Human(String name, String profession, String address){this.name=name; this.profession=profession; this.address=address;}
        public Human(String name, int weight){this.name=name; this.weight=weight;}
        public Human(String name, boolean sex){this.name=name; this.sex=sex;}
        public Human(String name, boolean sex, Date date){this.name=name; this.sex=sex; this.birthDay=date;}
        public Human(String name, Date date, int weight){this.name=name; this.birthDay=date; this.weight=weight;}
        public Human(String name, Date date){this.name=name;  this.birthDay=date;}
        public Human(String name, Date date, int weight, String address){this.address=address; this.name=name; this.weight=weight; this.birthDay=date;}
        public Human(String name, boolean sex, Date date, String profession){this.profession=profession; this.name=name; this.sex=sex; this.birthDay=date;}


    }
}
