package com.example.testinterview;

public class MatrixDiagonal {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 3;
        matrix[0][1] = 5;
        matrix[0][2] = 7;

        matrix[1][0] = 8;
        matrix[1][1] = 2;
        matrix[1][2] = 1;

        matrix[2][0] = 6;
        matrix[2][1] = 9;
        matrix[2][2] = 2;

        int diagonal1 = 0;
        int diagonal2 = 0;
        for (int i = 0; i < 3; i++) {
            diagonal1 += matrix[i][i];
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 2; j >= 0; j--) {
                int x = j - i;
                diagonal2 += matrix[i][x];
                break;
            }
        }

        int differentValue = 0;
        if (diagonal1 > diagonal2) {
            differentValue = diagonal1 - diagonal2;
        }else{
            differentValue = diagonal2 - diagonal1;
        }
        System.out.println(differentValue);
    }
}
