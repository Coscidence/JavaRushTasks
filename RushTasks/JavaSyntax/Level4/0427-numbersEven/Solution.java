package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferedReader.readLine());
        if (x%2==0 && x > 0  && x < 10)
            System.out.println("четное однозначное число");
        else if (x%2==0 && x >= 10 && x <=99)
            System.out.println("четное двузначное число");
        else if (x%2==0 && x >= 100 && x <= 999)
            System.out.println("четное трехзначное число");
        else if (x%2!=0 && x > 0  && x < 10)
            System.out.println("нечетное однозначное число");
        else if (x%2!=0 && x >= 10 && x <=99)
            System.out.println("нечетное двузначное число");
        else if (x%2!=0 && x >= 100 && x <= 999)
            System.out.println("нечетное трехзначное число");
    }
}
