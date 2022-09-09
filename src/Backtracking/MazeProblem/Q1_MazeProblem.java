package Backtracking.MazeProblem;

public class Q1_MazeProblem {
    public static void main(String[] args) {

        // Only go right and down
        System.out.println(maze(3,3));

//           3   2   1
//          ___ ___ ___
//      3  |_S_|___|___|    S = Source
//      2  |___|___|___|    D = Destination
//      1  |___|___|_D_|


        // right, down and diagonal
        System.out.println(maze2(3,3));
    }

    static int maze(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int down = maze(r - 1, c);
        int right = maze(r, c - 1);

        return down + right;
    }

    static int maze2(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int down = maze2(r - 1, c);
        int right = maze2(r, c - 1);
        int diagonal = maze2(r - 1,c-1);

        return down + right + diagonal;
    }

}
