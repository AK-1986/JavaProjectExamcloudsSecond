package com.company.lesson6;

/**
 *
 *
 */
public class Average {
    public static void main(String[] args) {
        double[] nums = {1.15, 2.45, 4.36};
        double summ = 0;

        for (double i: nums) {
            summ += i;
        }
        double result = summ / nums.length;
        System.out.println("Среднее арифметическое = " + result);
    }
}
