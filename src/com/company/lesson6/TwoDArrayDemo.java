package com.company.lesson6;

public class TwoDArrayDemo {
    public static void main(String[] args) {
        String[][] array = new String[3][6];
        char symbol = 'a';
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = symbol + "" + (j + 1);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
            symbol++;
        }
    }
}
