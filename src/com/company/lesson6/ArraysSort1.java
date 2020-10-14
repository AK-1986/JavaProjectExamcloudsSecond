package com.company.lesson6;

import java.util.Arrays;

public class ArraysSort1 {
    public static void main(String[] args) {
        //int[] array = new int[]{3, 1, 5, 6, 8};
        int[] array = {2, 1, 5, 6, 8};
        Arrays.sort(array);                          // сортировака по возрастанию
        System.out.println(Arrays.toString(array));
    }
}
