package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer getNum = Integer.parseInt(reader.readLine());
        Integer getNum1 = Integer.parseInt(reader.readLine());
        Integer getNum2 = Integer.parseInt(reader.readLine());
        checkNum(getNum, getNum1, getNum2);//напишите тут ваш код0
    }

    public static void checkNum(int num1, int num2, int num3)
    {
        if ((num1 >= 0) && (num2 >= 0) && (num3 >= 0)) System.out.println("3");
        if (((num1 >= 0) && (num2 < 0) && (num3 >= 0)) || ((num1 < 0) && (num2 >= 0) && (num3 >= 0)) || ((num1 >= 0) && (num2 >= 0) && (num3 < 0))) System.out.println("2");
        if (((num1 < 0) && (num2 < 0) && (num3 >= 0)) || ((num1 < 0) && (num2 >= 0) && (num3 < 0)) || ((num1 >= 0) && (num2 < 0) && (num3 < 0))) System.out.println("1");
        if ((num1 < 0) && (num2 < 0) && (num3 < 0)) System.out.println("0");
    }
}
