package com.javarush.task.task04.task0438;

/* 
Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок (символ из горизонтальной строки не учитывается).


Требования:
1. Программа не должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить горизонтальную линию из 10 восьмёрок.
4. Программа должна выводить вертикальную линию из 10 восьмёрок.
5. В программе должен использоваться цикл for.
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            String a = "8";
            System.out.print(a);}
            for (int c = 0; c < 11; c++) {
            String b = "8";
            System.out.println(b);
        }
    }
}