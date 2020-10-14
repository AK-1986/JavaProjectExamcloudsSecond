package com.company.lesson3;

import java.util.Scanner;

public class Primer1 {
    /*Создать программу, которая будет сообщать, является ли целое число, введённое пользователем, чётным или нечётным.
      Если пользователь введёт не целое число, то сообщать ему об ошибке.*/
    public static void main(String[] args) {
        int i = 0;
        byte b = 0;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
            i = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
            b = (byte) (i & 1);
            if (b == 0) {     // 0 - четное, 1 - нечетное
                System.out.println(b + " - Число " + i + " - четное");
            } else {
                System.out.println(b + " - Число " + i + " - нечетное");
            }
        } else {
            System.out.println("Вы ввели не целое число");
            //  return;
        }
    }
}

