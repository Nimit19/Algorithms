package LinearSearch;

import java.util.Arrays;

public class Q5_SearchInArray2D {
    public static void main(String[] args) {
        int[][] a ={
                {1,25,38,4,52},
                {51,26,49},
                {10,65,36,56,68},
                {6,9}
        } ;

        int target = 36;
        System.out.println(search(a,target));
        System.out.println(search2(a,target));

        System.out.println(Arrays.toString(searchIndex(a, target)));
    }

    static boolean search(int[][] a, int target) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean search2(int[][] a, int target) {
        for (int[] ints : a) {
            for (int element : ints) {
                if (element == target) {
                    return true;
                }
            }
        }
        return false;
    }

    static int[] searchIndex(int[][] a, int target) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

}
