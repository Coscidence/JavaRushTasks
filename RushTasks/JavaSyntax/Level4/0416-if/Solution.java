package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sTime = bufferedReader.readLine();
        double t = Double.parseDouble(sTime);
        if ( t % 5 >= 0 && t % 5 < 3)
            System.out.println("зелёный");
        if ( t % 5 >= 3 && t % 5 < 4)
            System.out.println("жёлтый");
        if ( t % 5 < 0 || t % 5 >= 4)
            System.out.println("красный");
    }
}