package com.company.lesson6;

public class CharArrayDemo {
    public static void main(String[] args) {
        char[][] array = {
                {'r', 'h'},
                {'s', 'd'},
                {'x', 'v'},
                {'a', 'w'}
        };
        for (char[] row : array) {
            for (char element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
       // System.out.println(array[0].length);
       // System.out.println(Arrays.deepToString(array));
    }
}
