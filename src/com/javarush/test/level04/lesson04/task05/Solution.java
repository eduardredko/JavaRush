package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();//напишите тут ваш код
        res(Integer.parseInt(num));
    }

    public static void res (int a)
    {
        if (a < 0) {
            a = a + 1;
            System.out.println(a);
        } else {
            a = a * 2;
            System.out.println(a);
        }
    }

}