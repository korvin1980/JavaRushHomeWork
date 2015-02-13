package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int[] iArray = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0;i<10;i++)
        {
            iArray[i]=Integer.parseInt(reader.readLine());
        }

        reverseIntArray(iArray);

        for (int i=0; i<iArray.length;i++){
            System.out.println(iArray[i]);
        }

    }

    public static int[] reverseIntArray (int [] arr){
        double dMiddle = Math.round(arr.length/2);
        int iMiddle = ((int) dMiddle) -1;

        for (int i=0; i<=iMiddle; i++){
            int temp = arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;

        }

        return arr;
    }
}
