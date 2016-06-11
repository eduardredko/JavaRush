package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int max = 0;

        if (a > b) {max = a;}
            else {max = b;}
        if (c > d) {
            if (c > max) System.out.println(c);
                else System.out.println(max);
        } else {
            if (d > max) System.out.println(d);
                else System.out.println(max);
        }

        //напишите тут ваш код

    }
}
