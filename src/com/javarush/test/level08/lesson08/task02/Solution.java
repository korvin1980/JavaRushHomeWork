package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        //Напишите тут ваш код
        HashSet<Integer> set = new HashSet<Integer>();
        while (set.size()<20)
        {
            int num = (int) (Math.random()*100);
            set.add(num);
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //Напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext())
        {
            Integer num = iterator.next();
            if (num > 10)
                set.remove(new Integer(num));
        }
        return set;
    }

    public static void printSet(HashSet<Integer> set)
    {
        //Напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) System.out.println(iterator.next());
    }

    public static void main(String[] args)
    {
        HashSet<Integer> set = createSet();
        printSet(set);
        System.out.println("--------------");
        removeAllNumbersMoreThan10(set);
        printSet(set);
    }
}
