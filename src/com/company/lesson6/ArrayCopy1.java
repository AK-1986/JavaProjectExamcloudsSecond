package com.company.lesson6;

import java.util.Arrays;

public class ArrayCopy1 {
    public static void main(String[] args) {
        int[] arraySource = {1, 2, 3, 4, 5, 6};
        int[] arrayDestination = {0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println("arraySource: " + Arrays.toString(arraySource));
        System.out.println("arrayDestination: "
                + Arrays.toString(arrayDestination));

        System.arraycopy(arraySource, 0, arrayDestination, 0, arraySource.length);
        System.out.println("arrayDestination after arrayCopy: "
                + Arrays.toString(arrayDestination));
    }
}