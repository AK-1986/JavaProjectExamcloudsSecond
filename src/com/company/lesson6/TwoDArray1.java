package com.company.lesson6;

public class TwoDArray1 {
    public static void main(String[] args) {
        int[][] twoD = new int[4][5];
        int i, j, k = 1;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k++;
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}