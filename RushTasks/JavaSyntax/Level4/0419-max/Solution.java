package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int d = Integer.parseInt(bufferedReader.readLine());

        if (d>=a && d>=c && d>=b) {
            System.out.println(d);
        }else if(a>=b && a>=c && a>=d){
            System.out.println(a);
        }else if(b>=a && b>=c && b>=d){
            System.out.println(b);
        }else if(c>=a && c>=b && c>=d) {
            System.out.println(c);
        }
    }
}
