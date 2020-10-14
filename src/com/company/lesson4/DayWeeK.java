package com.company.lesson4;

public class DayWeeK {
    public static void main(String[] args) {
        if (Integer.parseInt(args[0]) == 1) {
            System.out.println("Понедельник");
        } else if (Integer.parseInt(args[0]) == 2) {
            System.out.println("Вторник");
        } else if (Integer.parseInt(args[0]) == 3) {
            System.out.println("Среда");
        } else if (Integer.parseInt(args[0]) == 4) {
            System.out.println("Вторник");
        } else if (Integer.parseInt(args[0]) == 5) {
            System.out.println("Пятница");
        } else if (Integer.parseInt(args[0]) == 6 || Integer.parseInt(args[0]) == 7) {
            System.out.println("Выходной");
        } else {
            System.out.println("Ошибка");
        }
    }
}
