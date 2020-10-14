package com.company.lesson4;

public class DayWeek2 {
    public static void main(String[] args) {
        if ("1".equals(args[0])) {
            System.out.println("Понедельник");
        } else if ("2".equals(args[0])) {
            System.out.println("Вторник");
        } else if ("3".equals(args[0])) {
            System.out.println("Среда");
        } else if ("4".equals(args[0])) {
            System.out.println("Вторник");
        } else if ("5".equals(args[0])) {
            System.out.println("Пятница");
        } else if ("6".equals(args[0]) || "7".equals(args[0])) {
            System.out.println("Выходной");
        } else {
            System.out.println("Ошибка");
        }
    }
}
