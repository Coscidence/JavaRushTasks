package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {
        double j = ((i / 100.00) * 10);
        return j + i;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
