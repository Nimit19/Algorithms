package BinarySearch;

import java.util.Arrays;

public class Q4_BinarySearch2D {
    public static void main(String[] args) {
        int[][] a = {
                {10, 25, 35, 98},
                {20, 28, 38, 100},
                {29, 39, 45, 148},
                {36, 48, 53, 198}
        };
        int target = 98;
        System.out.println(Arrays.toString(search(a,target)));
    }

    // it's support only col row sorted matrix
    // return row and col index
    // return [-1,-1] if element not exist
    static int[] search(int[][] matrix,int target){
        int row = 0;
        int col = matrix.length - 1;

        while(row < matrix.length && col >= 0){

            if(matrix[row][col] == target){
                return new int[]{row,col};
            }

            if(matrix[row][col] < target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
