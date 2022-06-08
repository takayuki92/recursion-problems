package com.company;

public class NQueen3 {
    int n;
    Integer[][] matrix;
    NQueen3(int n) {
        this.n = n;
        this.matrix = new Integer[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
        }
    }
    int count = 1;// Count number of solutions
    //Find solution
    boolean findSolution(int row) {
        if(row == n) {
            System.out.print(count + ": ");
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(matrix[i][j] == 1) {
                        j = j+1;
                        System.out.print(j + " ");//display the index of each column by row e.g. 1 3 5 2 4
                    }                             // represents for 1-1 2-3 3-5 4-2 5-4
                }
            }
            count++;
            System.out.println();
            return false;
        }
        //back track
        for(int j = 0; j < n; j++) {
            if(isSafe(matrix, row, j, n)) {
                matrix[row][j] = 1;
                if(!(findSolution( row+1))) {//check whether finding a new solution or else tracking back
                    matrix[row][j] = 0;
                }
            }
        }
        return false;
    }

    boolean isSafe(Integer[][] matrix, int row, int col, int n) {
        //column check
        for(int i = 0; i < n; i++) {
            if(matrix[i][col] == 1) {
                return false;
            }
        }
        //top left diagonal check
        for(int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if(matrix[i][j] == 1) {
                return false;
            }
        }
        //top right diagonal check
        for(int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if(matrix[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
}
