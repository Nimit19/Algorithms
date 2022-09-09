package Backtracking.MazeProblem;

public class Q4_MazeWithObstacles {
    public static void main(String[] args) {

        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };

//             0 1 2
//          0  T T T
//          1  T F T
//          2  T T T


        mazePathWithRestriction(maze, "",0,0);
    }

    static void mazePathWithRestriction(boolean[][] maze, String p, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        if(r < maze.length - 1){
            mazePathWithRestriction(maze, p + "D", r + 1, c);
        }

        if(c < maze[0].length - 1){
            mazePathWithRestriction(maze, p + "R", r , c + 1);
        }

    }
}
