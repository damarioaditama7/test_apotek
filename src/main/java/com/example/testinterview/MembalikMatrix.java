package com.example.testinterview;

public class MembalikMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 2;
        matrix[0][1] = 6;
        matrix[0][2] = 9;

        matrix[1][0] = 1;
        matrix[1][1] = 5;
        matrix[1][2] = 8;

        matrix[2][0] = 7;
        matrix[2][1] = 2;
        matrix[2][2] = 7;

        for (int i = 2; i >=0; i--) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i]);
            }
            System.out.println();
        }
    }

}
