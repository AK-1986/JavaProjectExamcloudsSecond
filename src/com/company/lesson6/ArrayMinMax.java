package com.company.lesson6;

import java.util.Arrays;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5, 6, 7, 8},
                {11, 12, 13, 14, 15, 16, 17, 18},
                {21, 22, 23, 24, 25, 26, 27, 28},
                {31, 32, 33, 34, 35, 36, 37, 38},
                {41, 42, 43, 44, 45, 46, 47, 48},
        };
        int[][] resultArray = new int[5][2];

        for (int i = 0; i < resultArray.length; i++) {
            int min = getMin2(array[i]);
            int max = getMax(array[i]);
            for (int j = 0; j < resultArray[i].length - 1; j++) {
                resultArray[i][j] = min;
                resultArray[i][j + 1] = max;
            }
        }
        System.out.println(Arrays.deepToString(resultArray));

    }

    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (minValue > inputArray[i]) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }

    public static int getMin2(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            minValue = Math.min(minValue, inputArray[i]);
        }
        return minValue;
    }

    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int element : inputArray) {
            if (maxValue < element) {
                maxValue = element;
            }
        }
        return maxValue;
    }
}
