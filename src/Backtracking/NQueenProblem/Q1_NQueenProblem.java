package Backtracking.NQueenProblem;

public class Q1_NQueenProblem {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        System.out.println(nQueen(board,0));
    }

    static int nQueen(boolean[][] board, int r){
        if(r == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        for (int c = 0; c < board.length; c++) {
            if(isSafe(board,r,c)){
                board[r][c] = true;
                count += nQueen(board,r+1);
                board[r][c] = false;
            }
        }
        return count;
    }


    static boolean isSafe(boolean[][] board, int r, int c) {
        // Vertical
        for (int i = 0; i < r; i++) {
            if(board[i][c]){
                return false;
            }
        }

        // left diagonal
        int maxLeft = Math.min(r, c);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[r - i][c - i]){
                return false;
            }
        }

        // right diagonal
        int maxRight = Math.min(r, board.length - 1 - c);
        for (int i = 1; i <= maxRight; i++) {
            if(board[r - i][c +  i]){
                return false;
            }
        }
        return true;
    }

    static void display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j]){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
