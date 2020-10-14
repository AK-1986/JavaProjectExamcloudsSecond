package com.company.lesson4;

/*Реализовать подсчет факториала используя цикл for.
n! = 1*2*...*n;​
0!=1;
5! = 1*2*3*4*5;
Число n задается случайным образом (используйте Math.random()).*/

public class Factorial1 {
    public static void main(String[] args) {
        int ii = (int) (Math.random() * 10);
        int n = 1;
        for (int i = 1; i <= ii; i++) {
            n *= i;
        }
        System.out.println(ii + "!= " + n);
    }
}
