package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(65,77));
        System.out.println(convertEurToUsd(55,67));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        Double usd = eur * exchangeRate;
        return usd;

    }
}
