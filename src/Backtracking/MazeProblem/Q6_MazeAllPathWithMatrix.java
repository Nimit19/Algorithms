package Backtracking.MazeProblem;

import java.util.Arrays;

public class Q6_MazeAllPathWithMatrix {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };

        int[][] path = new int[maze.length][maze[0].length];

        mazeAllPathMatrix(maze,"",0,0,path,1);
    }
    static void mazeAllPathMatrix(boolean[][] maze, String p, int r, int c,int[][] path,int step){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            path[r][c] = step;
            System.out.println(p);
            for (int[] a : path) {
                System.out.println(Arrays.toString(a));
            }
            System.out.println();
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;

        if(c != 0){
            mazeAllPathMatrix(maze, p + "L", r , c - 1, path,step + 1);
        }

        if(r != 0){
            mazeAllPathMatrix(maze, p + "U", r - 1 , c, path,step + 1);
        }

        if(r < maze.length - 1){
            mazeAllPathMatrix(maze, p + "D", r + 1, c, path,step + 1);
        }

        if(c < maze[0].length - 1){
            mazeAllPathMatrix(maze, p + "R", r , c + 1, path,step + 1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
