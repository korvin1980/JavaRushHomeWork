package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        //Напишите тут ваш код
        int[] arr = new int[5];

        for (int i=0; i<5; i++)
            arr[i]=Integer.parseInt(reader.readLine());

        sortIntArray(arr, true);

        for (int i=0; i<5; i++)
            System.out.println(arr[i]);
    }

    public static int[] sortIntArray (int[] a, boolean AscSort){
        /*Сортировка пузырком:

        Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный/minimal~nyj элемент*/
        for(int i = a.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            /*Сравниваем элементы попарно, 
              если они имеют неправильный порядок, 
              то меняем местами*/
            if( AscSort==(a[j] > a[j+1]) ){
                int tmp = a[j];
                a[j] = a[j+1];
                a[j+1] = tmp;
            }
        }
    }
        return a;
    }
}
