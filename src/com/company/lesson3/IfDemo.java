package com.company.lesson3;

public class IfDemo {
    public static void main(String[] args) {
        System.out.println(args[0]);
        int namber = Integer.parseInt(args[0]);
        if (namber % 2 != 0) {
            System.out.println("Число " + namber + " Не четное");
        } else {
            System.out.println("Число " + namber + " Четное");
        }
    }
}
