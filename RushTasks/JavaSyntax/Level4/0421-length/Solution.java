package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();
        int len1 = name.length();
        int len2 = name2.length();
        if (name.equals(name2)) {
            System.out.println("Имена идентичны");
        } else if (len1 == len2){
            System.out.println("Длины имен равны");
        }
    }
}
