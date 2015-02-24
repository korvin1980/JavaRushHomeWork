package com.javarush.test.level15.lesson12.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* Осваивание статического блока
1. В отдельных файлах создать классы Plane и Helicopter, реализующие интерфейс Flyable.
2. Класс Plane должен иметь 1 конструктор с параметром int - количество перевозимых пассажиров.
3. В статическом методе reset класса Solution:
3.1. Считать с консоли параметр типа String. Параметр может быть "plane" или "helicopter".
3.2. Закрыть поток ввода методом close().
3.3. Если параметр равен "helicopter", то статическому объекту Flyable result присвоить объект класса Helicopter.
3.4. Если параметр равен "plane", то считать второй параметр типа int, статическому объекту Flyable result
присвоить объект класса Plane.
4. В статическом блоке инициализировать Flyable result вызвав метод reset.
*/

public class Solution {
    static {
        reset();
    }

    public static Flyable result;


    public static void reset() {
        String param=readSafe();

        if ("helicopter".equals(param)){
            result = new Helicopter();
            System.out.println(result);}
        if ("plane".equals(param)){
            String sNumPass = readSafe();
            int numPassengers=Integer.parseInt(sNumPass);
            result = new Plane(numPassengers);
            System.out.println(result);
        }
        closeInputStream();
    }

    public static void closeInputStream(){
        try
        {
            System.in.close();
        }
        catch (IOException e)
        {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static String readSafe(){
        String result="";
        try {
            result=read();
        }
        catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
        finally{
            return result;
        }
    }
    private static String read () throws IOException
    {
        String result ="";
        InputStreamReader inStrReader= new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader (inStrReader);
        result = reader.readLine();
        return result;
    }

}

