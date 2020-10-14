package com.company.lesson3;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            compareNamber(a);
        } else {
            System.out.println("Введено не целое число");
        }
    }

    private static void compareNamber(int a) {
        if (a > 0 && a < 10) {
            System.out.println("Введенное число больше 0 и меньше 10");
        } else {
            System.out.println("Введенное число отлицательное или больше 10");
        }
    }
}