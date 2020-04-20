package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
    Zerg zerg = new Zerg();
        zerg.name = "lol";
    Zerg zerg1 = new Zerg();
        zerg1.name = "lol1";
    Zerg zerg2 = new Zerg();
        zerg2.name = "lol2";
    Zerg zerg3 = new Zerg();
        zerg3.name = "lol3";
    Zerg zerg4 = new Zerg();
        zerg4.name = "lol4";

    Protoss zerg5 = new Protoss();
        zerg5.name = "lol5";
    Protoss zerg6 = new Protoss();
        zerg6.name = "lol6";
    Protoss zerg7 = new Protoss();
        zerg7.name = "lol7";

    Terran zerg8 = new Terran();
        zerg8.name = "lol8";
    Terran zerg9 = new Terran();
        zerg9.name = "lol9";
    Terran zerg10 = new Terran();
        zerg10.name = "lol10";
    Terran zerg11 = new Terran();
        zerg11.name = "lol11";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
