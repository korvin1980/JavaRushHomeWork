package com.javarush.test.level09.lesson02.task02;

/* И снова StackTrace
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static String method1()
    {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        //System.out.println("Method 1 is called by: " + stackTraceElements[0].getMethodName());

        method2();
        //Напишите тут ваш код

        return stackTraceElements[2].getMethodName();
    }

    public static String method2()
    {
        method3();
        //Напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
    }

    public static String method3()
    {
        method4();
        //Напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
    }

    public static String method4()
    {
        method5();
        //Напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
    }

    public static String method5()
    {
        //Напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

//        for (StackTraceElement element : stackTraceElements)
//            System.out.println(element.getMethodName());

        return stackTraceElements[2].getMethodName();

    }
}
