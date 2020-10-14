package com.company.professions;

public class Girlanda {
    /*Имеется гирлянда, состоящая из 32 лампочек. Каждая лампочка имеет два состояния - включена или выключена.
    В начале работы программы случайным образом задайте какие лампочки будут включены.

    Напишите следующие методы:
    a) метод который будет мигать лампочками гирлянды заданное количество раз (операция ~);
    б) метод, который будет запускать гирлянду в режим бегущей строки (операция << или >>);
    в) метод, который будет выяснять включена ли лампочки на первой позиции (наложение маски с помощью &);
    г) метод который будет распечатывать текущее состояние гирлянды.
    Используйте побитовые операции. Для получения двоичного формата числа используйте метод Integer.toBinaryString(a).*/
    public static void main(String[] args) {
        int girlanda = 50;
        int kol = 10;
        System.out.println(Integer.toBinaryString(girlanda));

        //blink(girlanda);
        // ranBlink(girlanda, kol);
        vklLamp(girlanda);

    }

    static void blink(int g) {
        g = ~g;
        System.out.println(Integer.toBinaryString(g));
    }

    static void ranBlink(int g, int ii) {
        for (int i = 0; i <= ii; i++) {
            int ran = g << i;
            System.out.println(Integer.toBinaryString(ran));
        }
    }

    static void vklLamp(int g) {
        if ((g & 1) == 0) {
            System.out.println("Первая лампочка выключена");
        } else {
            System.out.println("Первая лампочка включена");
        }
    }
}


