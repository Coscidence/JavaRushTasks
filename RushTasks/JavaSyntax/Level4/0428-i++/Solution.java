package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int d = 0;
        if(a>0) {
            d++;
        }if(b>0) {
            d++;
        }if(c>0) {
            d++;
        }if (d>0){
            System.out.println(d);
        }else {
            System.out.println("0");
        }
    }
}
