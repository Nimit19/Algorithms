package Backtracking.SudokuSolver;

import java.util.Arrays;

public class S1_SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (sudokuSolver(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }
    }

    private static void display(int[][] board) {
        int j = 1;
        for(int[] row : board){
            int i = 1;
            for (int element : row) {
                System.out.print(element + " ");
                if(i == 3 || i == 6 ){
                    System.out.print("| ");

                }
                i++;
            }
            System.out.println();
            if(j == 3 || j == 6){
                System.out.println("---------------------");

            }
            j++;
        }
    }

    static boolean sudokuSolver(int[][] board){
        int r = -1;
        int c = -1;

        boolean emptyLeft = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == 0){
                    r = i;
                    c = j;
                    emptyLeft = false;
                    break;
                }
            }
            if (emptyLeft == false){
                break;
            }
        }

        // Sudoku solve
        if(emptyLeft == true){
            return true;
        }

        for (int num = 0; num < 10; num++) {
            if(isSafe(board, r, c, num)){
                board[r][c] = num;
                if(sudokuSolver(board)){
                    return true;
                }else {
                    board[r][c] = 0;
                }
            }
        }
        return false;
    }
    static boolean isSafe(int[][] board, int r, int c, int num){

        // checking for column
        for (int i = 0; i < board.length; i++) {
            if(board[i][c] == num){
                return false;
            }
        }

        // checking for row
        for (int i = 0; i < board.length; i++) {
            if(board[r][i] == num){
                return false;
            }
        }

        // checking for box
        int s = (int)Math.sqrt(board.length);
        int startRow = r - r % s;
        int startCol = c - c % s;
        for (int i = startRow; i < startRow + s; i++) {
            for (int j = startCol; j < startCol + s; j++) {
                if(board[i][j] == num){
                    return false;
                }
            }
        }

        return true;
    }
}
