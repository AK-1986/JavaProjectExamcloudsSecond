package com.company.lesson4;

public class DoWhile1 {
    public static void main(String[] args) {
        // Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while
        int i = 1;
        do {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 100);
    }
}
