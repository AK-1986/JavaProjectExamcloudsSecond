package com.company.lesson6;

import java.util.Arrays;

public class BinarySearch1 {
    public static void main(String[] args) {
        // int[] array1 = {10, 20, 30, 40};
        int[] array1 = {20, 10, 40, 30};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        int pos1 = Arrays.binarySearch(array1, 20);
        int pos2 = Arrays.binarySearch(array1, 25);
        System.out.println(pos1);
        System.out.println(pos2);
    }
}
