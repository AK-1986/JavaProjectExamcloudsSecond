package com.company.professions;

import java.util.Scanner;

public class Primer2 {
    /*Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых пользователем вещественных чисел.
      Для вычисления модуля используйте тернарную условную операцию.*/
    public static void main(String[] args) {
        double i = 0;
        double ii = 0;
        double iii = 0;
        Scanner sc = new Scanner(System.in);
        for (int a = 1; a <= 3; a++) {
            System.out.println("Введите " + a + " число:");
            if (a == 1) {
                i = sc.nextDouble();
                //  i = Math.abs(i);
            } else if (a == 2) {
                ii = sc.nextDouble();
                //  ii = Math.abs(ii);
            } else {
                iii = sc.nextDouble();
                //  iii = Math.abs(iii);
            }
        }
        double min = 0;
        min = Math.abs(i) < Math.abs(ii) ? Math.abs(i) : Math.abs(ii);
        min = min < Math.abs(iii) ? min : Math.abs(iii);

        System.out.println("Модуль 1го числа - " + Math.abs(i));
        System.out.println("Модуль 2го числа - " + Math.abs(ii));
        System.out.println("Модуль 3го числа - " + Math.abs(iii));
        System.out.println("Минимальное значение по модулю = " + min);
    }

}
