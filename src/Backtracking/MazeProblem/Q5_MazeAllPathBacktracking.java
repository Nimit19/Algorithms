package Backtracking.MazeProblem;

public class Q5_MazeAllPathBacktracking {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };

        mazeAllPath(maze,"",0,0);
    }

    static void mazeAllPath(boolean[][] maze, String p, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;

        if(c != 0){
            mazeAllPath(maze, p + "L", r , c - 1);
        }

        if(r != 0){
            mazeAllPath(maze, p + "U", r - 1 , c);
        }

        if(r < maze.length - 1){
            mazeAllPath(maze, p + "D", r + 1, c);
        }

        if(c < maze[0].length - 1){
            mazeAllPath(maze, p + "R", r , c + 1);
        }

        maze[r][c] = true;
    }
}
