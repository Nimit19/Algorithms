package Backtracking.MazeProblem;

import java.util.ArrayList;

public class Q3_MazePath {
    public static void main(String[] args) {

        System.out.println(mazePathList("",3,3)); // V = Vertical, H = Horizontal, D = Diagonal
    }

    static ArrayList<String> mazePathList(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> l1 = new ArrayList<>();
            l1.add(p);
            return l1;
        }
        ArrayList<String> list = new ArrayList<>();

        if(c > 1 && r > 1){
            list.addAll(mazePathList(p + "D", r - 1, c - 1));
        }

        if(r > 1){
            list.addAll(mazePathList(p + "V", r - 1, c));
        }

        if(c > 1){
            list.addAll(mazePathList(p + "H", r, c - 1));
        }

        return list;
    }
}
