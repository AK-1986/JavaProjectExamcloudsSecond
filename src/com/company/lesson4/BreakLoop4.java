package com.company.lesson4;

public class BreakLoop4 {
    public static void main(String[] args) {
        outhe:
        for (int i = 0; i < 3; i++) {
            System.out.println("Проход " + i);
            for (int j = 0; j < 100; j++) {
                if (j == 10) {
                    break outhe; // выход из обоих циклов
                }
                System.out.print(j + " ");
            }
            System.out.println("Не выполнится");
        }
    }
}
