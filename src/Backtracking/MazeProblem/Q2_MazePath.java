package Backtracking.MazeProblem;

import java.util.ArrayList;

public class Q2_MazePath {
    public static void main(String[] args) {

        mazePath("",3,3); // D = Down  R = Right
        System.out.println(mazePathList("",3,3));
    }

    static void mazePath(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if(r > 1){
            mazePath(p + "D", r - 1, c);
        }

        if(c > 1){
            mazePath(p + "R", r, c - 1);
        }

    }

    static ArrayList<String> mazePathList(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> l1 = new ArrayList<>();
            l1.add(p);
            return l1;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r > 1){
            list.addAll(mazePathList(p + "D", r - 1, c));
        }

        if(c > 1){
            list.addAll(mazePathList(p + "R", r, c - 1));
        }

        return list;
    }
}
