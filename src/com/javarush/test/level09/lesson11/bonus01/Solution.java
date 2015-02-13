package com.javarush.test.level09.lesson11.bonus01;

import java.io.*;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        InputStream inStream = null;
        OutputStream outStream = null;
        try{

            File file1 =new File(sourceFileName);
            File file2 =new File(destinationFileName);

            inStream = new FileInputStream(file1);
            outStream = new FileOutputStream(file2); // for override file content
            //outStream = new FileOutputStream(file2,true); // for append file content

            byte[] buffer = new byte[1024];

            int length;
            int size=0;
            while ((length = inStream.read(buffer)) > 0){
                outStream.write(buffer, 0, length);
                size+=length;
            }

            if (inStream != null)inStream.close();
            if (outStream != null)outStream.close();

            System.out.println("Скопировано байт " + size);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
