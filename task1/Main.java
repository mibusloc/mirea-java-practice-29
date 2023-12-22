package ru.mirea.lab29.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int roadCount = countRoads(matrix);
        System.out.println(roadCount);
    }

    private static int countRoads(int[][] matrix) {
        int roadCount = 0;

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                roadCount += anInt;
            }
        }
        return roadCount / 2;
    }
}

