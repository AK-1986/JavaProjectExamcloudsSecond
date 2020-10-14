package com.company.lesson4;

/*Реализовать подсчет факториала используя цикл for.
n! = 1*2*...*n;​
0!=1;
5! = 1*2*3*4*5;
Число n задается пользователем*/

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = 1;
            int ii = sc.nextInt();
            for (int i = 1; i <= ii; i++) {
                n *= i;
            }
            System.out.println(ii + "!= " + n);
        } else
            System.out.println("Число не целое");
    }
}
