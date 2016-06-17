package com.javarush.test.level04.lesson07.task02;

/* Строка - описание
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
«четное однозначное число» - если число четное и имеет одну цифру,
«нечетное однозначное число» - если число нечетное и имеет одну цифру,
«четное двузначное число» - если число четное и имеет две цифры,
«нечетное двузначное число» - если число нечетное и имеет две цифры,
«четное трехзначное число» - если число четное и имеет три цифры,
«нечетное трехзначное число» - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
Пример для числа 100:
четное трехзначное число
Пример для числа 51:
нечетное двузначное число
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String getNum = reader.readLine();
        checkNum(getNum);
        //напишите тут ваш код

    }

    public static void checkNum(String num) {

        int length = num.length();
        int a = Integer.parseInt(num);
        if ((a >= 1) && (a <= 999))
        {
            if (a % 2 == 0)
            {
                if (length == 3) System.out.print("четное трехзначное число");
                else
                {
                    if (length == 2) System.out.print("четное двузначное число");
                    else System.out.print("четное однозначное число");
                }
            } else
            {
                if (length == 3) System.out.print("нечетное трехзначное число");
                else
                {
                    if (length == 2) System.out.print("нечетное двузначное число");
                    else System.out.print("нечетное однозначное число");
                }
            }
        }
    }
}
