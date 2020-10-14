package com.company.lesson3;

public class AverageValue {
    /*Вычислить среднее значение трех вещественных чисел передаваемых на вход программы в качестве аргументов.
    Для преобразования из String в double используйте метод Double.parseDouble(String s).*/
    public static void main(String[] args) {
        double a1 = Double.parseDouble(args[0]);
        double a2 = Double.parseDouble(args[1]);
        double a3 = Double.parseDouble(args[2]);
        double rez = AceVal(a1, a2, a3);
        System.out.println(rez);

    }

    private static double AceVal(double a1, double a2, double a3) {
        double res = (a1 + a2 + a3) / 3;
        return res;

    }

}
