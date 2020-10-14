package com.company.lesson4;

public class For1 {
    public static void main(String[] args) {
        // Распечатать 5 символов в одну строку начиная с ‘h’. Используем цикл for.
        char simbol = 'h';
        for (int i = 0; i < 15; i++) {
            System.out.print((char)(simbol + i));
        }
    }
}
