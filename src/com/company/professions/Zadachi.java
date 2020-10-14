package com.company.professions;

import java.util.Scanner;

public class Zadachi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int i = 0;
        int a = 0;
        System.out.print ("Введите целое число: ");
        if (sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
            i = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
            System.out.print ("Введите второе целое число: ");
        } else {
            System.out.println("Вы ввели не целое число");
            return;
        }
        if (sc.hasNextInt()) {
            a = sc.nextInt();
            System.out.println (i + a);
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
