package com.company.lesson4;

/**
* Реализовать подсчет факториала используя цикл for.
* n! = 1*2*...*n;​
* 0!=1;
* 5! = 1*2*3*4*5;
* Число n задается пользователем
*/

import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
        System.out.print("Введите целое число: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int ii = sc.nextInt();
            System.out.println(ii + "!= " + factorial(ii));
        } else
            System.out.println("Число не целое");

    }

    public static int factorial(int b) {
        int n = 1;
        for (int i = 1; i <= b; i++) {
            n *= i;
        }
        return n;
    }
}